package comp3350.superset.tests.business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import comp3350.superset.business.AccessRoutines;
import comp3350.superset.objects.Exercise;
import comp3350.superset.objects.ExerciseList;
import comp3350.superset.objects.Routine;
import comp3350.superset.persistence.RoutinePersistence;
import comp3350.superset.persistence.stubs.RoutinePersistenceStub;

public class AccessRoutinesTest {
    private AccessRoutines arWithStub;
    private RoutinePersistence mockRoutinePersistence;
    private List<Routine> testRoutineList;

    @Before
    public void setUp() {
        testRoutineList = new ArrayList<>();
        arWithStub = new AccessRoutines(new RoutinePersistenceStub());
    }

    @Test
    public void testGetRoutineDisplayable() {

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Routine1\n\te1   5sec\n\te2   10sec");
        expectedResult.add("Routine2\n\te2   10sec");
        expectedResult.add("Routine3\n\te1   5sec\n\te2   10sec");

        assertEquals(expectedResult, arWithStub.getRoutineDisplayable());
    }

    @Test
    public void testInsertRoutine() {
        ExerciseList exercises = new ExerciseList();
        exercises.add(new Exercise("Exercise1", 60));
        Routine routine = new Routine("Routine1", exercises);

        assertTrue(arWithStub.insertRoutine(routine));
        assertTrue(arWithStub.getRoutines().contains(routine));
    }
}
