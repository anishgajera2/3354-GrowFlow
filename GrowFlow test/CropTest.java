import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;

public class CropTest {

    @Test
    public void testConstructor() {
        Crop crop = new Crop("Tomato", "Roma", "2023-04-01", "2023-06-30", 1);
        assertNotNull(crop);
        assertEquals("Tomato", crop.getName());
        assertEquals("Roma", crop.getVariety());
        assertEquals(LocalDate.parse("2023-04-01"), crop.getPlantingDate());
        assertEquals(LocalDate.parse("2023-06-30"), crop.getHarvestDate());
        assertEquals(1, crop.getRotationIndex());
    }

    @Test
    public void testGetHarvestDate() {
        Crop crop = new Crop("Tomato", "Roma", "2023-03-01", "2023-05-30", 2);
        assertTrue(crop.isReadyToHarvest("2023-05-30"));
        assertFalse(crop.isReadyToHarvest("2023-05-01"));
        assertTrue(crop.isReadyToHarvest("2023-06-01"));
    }

    @Test
    public void testGetName() {
        Crop crop = new Crop();
        crop.setName("Tomato");
        assertEquals("Tomato", crop.getName());
    }

    @Test
    public void testGetPlantingDate() {
        Crop crop = new Crop();
        crop.setPlantingDate("2022-04-20");
        assertEquals(LocalDate.parse("2022-04-20"), crop.getPlantingDate());
    }

    @Test
    public void testGetRotationIndex() {
        Crop crop = new Crop();
        crop.setRotationIndex(1);
        assertEquals(1, crop.getRotationIndex());
    }

    @Test
    public void testGetVariety() {
        Crop crop = new Crop();
        crop.setVariety("Beefsteak");
        assertEquals("Beefsteak", crop.getVariety());
    }

    @Test
    public void testIsReadyToHarvest() {
        Crop crop = new Crop("Tomato", "Beefsteak", "2022-04-20", "2022-07-20", 1);
        assertTrue(crop.isReadyToHarvest("2022-07-20"));
        assertFalse(crop.isReadyToHarvest("2022-07-10"));
    }

    @Test
    public void testSetHarvestDate() {
        Crop crop = new Crop();
        crop.setHarvestDate("2022-07-20");
        assertEquals(LocalDate.parse("2022-07-20"), crop.getHarvestDate());
    }

    @Test
    public void testSetName() {
        Crop crop = new Crop();
        crop.setName("Tomato");
        assertEquals("Tomato", crop.getName());
    }

    @Test
    public void testSetPlantingDate() {
        Crop crop = new Crop();
        crop.setPlantingDate("2022-04-20");
        assertEquals(LocalDate.parse("2022-04-20"), crop.getPlantingDate());
    }

    @Test
    public void testSetRotationIndex() {
        Crop crop = new Crop();
        crop.setRotationIndex(1);
        assertEquals(1, crop.getRotationIndex());
    }

    @Test
    public void testSetVariety() {
        Crop crop = new Crop();
        crop.setVariety("Beefsteak");
        assertEquals("Beefsteak", crop.getVariety());
    }
}
