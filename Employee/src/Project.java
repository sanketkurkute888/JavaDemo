public class Project {
    String projectName;
    int projectDuration;

//    constructor


    public Project(String projectName, int projectDuration) {
        this.projectName = projectName;
        this.projectDuration = projectDuration;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(int projectDuration) {
        this.projectDuration = projectDuration;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", projectDuration=" + projectDuration +
                '}';
    }
}
