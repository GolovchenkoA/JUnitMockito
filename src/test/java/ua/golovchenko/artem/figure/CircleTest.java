package ua.golovchenko.artem.figure;


import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by головченко on 05.12.2016.
 */
public class CircleTest {
    @Mock
    Coordinats coordinats;

    @InjectMocks Circle circle;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testGetCoordinatsAfterSetCoordinats(){
        //Coordinats coordinats = mock(Coordinats.class);
        circle = new Circle(coordinats);
        circle.setCoordinats(2,3);

        ArgumentCaptor<Integer> x = ArgumentCaptor.forClass(int.class);
        ArgumentCaptor<Integer> y = ArgumentCaptor.forClass(int.class);

        verify(coordinats).setCoordinats(x.capture(),y.capture());
        verify(coordinats).setCoordinats(2,3);
        verify(coordinats, atLeastOnce()).setCoordinats(2,3);


        assertEquals((int)2,(int)x.getValue());
        assertEquals((int)3,(int)y.getValue());



    }


}
