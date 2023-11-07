package classes;

public class Module {
    // Instance variables
    private String moduleName;
    private int moduleCredits;
    private String moduleCode;

    // Constructor
    public Module(String moduleName, int moduleCredits, String moduleCode) {
        this.moduleName = moduleName;
        this.moduleCredits = moduleCredits;
        this.moduleCode = moduleCode;
    }

    // Getter methods
    public String getModuleName() {
        return moduleName;
    }

    public int getModuleCredits() {
        return moduleCredits;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    // Setter methods (optional)
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setModuleCredits(int moduleCredits) {
        this.moduleCredits = moduleCredits;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    // Override toString() method for better object representation
    @Override
    public String toString() {
        return "Module [moduleName=" + moduleName + ", moduleCredits=" + moduleCredits + ", moduleCode=" + moduleCode + "]";
    }
}
