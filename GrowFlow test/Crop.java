import java.time.LocalDate;

public class Crop {
    private String name;
    private String variety;
    private LocalDate plantingDate;
    private LocalDate harvestDate;
    private int rotationIndex;

    public Crop() {

    }

    public Crop(String name, String variety, String plantingDate, String harvestDate, int rotationIndex) {
        this.name = name;
        this.variety = variety;
        this.plantingDate = LocalDate.parse(plantingDate);
        this.harvestDate = LocalDate.parse(harvestDate);
        this.rotationIndex = rotationIndex;
    }

    public boolean isReadyToHarvest(String currentDate) {
        LocalDate date = LocalDate.parse(currentDate);
        return date.isEqual(harvestDate) || date.isAfter(harvestDate);
    }

    // getters and setters for all attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public LocalDate getPlantingDate() {
        return plantingDate;
    }

    public LocalDate getHarvestDate() {
        return harvestDate;
    }

    public int getRotationIndex() {
        return rotationIndex;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setPlantingDate(String plantingDate) {
        this.plantingDate = LocalDate.parse(plantingDate);
    }

    public void setHarvestDate(String harvestDate) {
        this.harvestDate = LocalDate.parse(harvestDate);
    }

    public void setRotationIndex(int rotationIndex) {
        this.rotationIndex = rotationIndex;
    }
}
