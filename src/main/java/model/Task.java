package model;

import java.time.LocalDate;
import java.util.List;

public class Task {
    private static int counter = 1;

    private final int id;
    private String title;
    private String description;
    private Status status;
    private Priority priority;
    private String summary;
    private boolean finish;
    private LocalDate createDate;
    private List<Skill> requireSkills;
    private Location location;
    private int createUserId;
    private int asigneUserId;


    public Task(String title, String description, Status status, Priority priority, String summary, boolean finish, LocalDate createDate, List<Skill> requireSkills, Location location, int createUserId, int asigneUserId) {
        this.id = counter++;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.summary = summary;
        this.finish = finish;
        this.createDate = createDate;
        this.requireSkills = requireSkills;
        this.location = location;
        this.createUserId = createUserId;
        this.asigneUserId = asigneUserId;
    }
    public Task(){
       this.id = counter ++;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", summary='" + summary + '\'' +
                ", finish=" + finish +
                ", createDate=" + createDate +
                ", requireSkills=" + requireSkills +
                ", location=" + location +
                ", createUserId=" + createUserId +
                ", asigneUserId=" + asigneUserId +
                '}';
    }

    public String getTitle() {
        return title;
    }

   /* public void setTitle(String title) {
        this.title = title;
    }*/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public List<Skill> getRequireSkills() {
        return requireSkills;
    }

    public void setRequireSkills(List<Skill> requireSkills) {
        this.requireSkills = requireSkills;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }

    public int getAsigneUserId() {
        return asigneUserId;
    }

    public void setAsigneUserId(int asigneUserId) {
        this.asigneUserId = asigneUserId;
    }


    public static TaskBuilder builder (){
        return new TaskBuilder();
    }


    public static class TaskBuilder{
        private String title;
        private String description;
        private Status status;
        private Priority priority;
        private String summary;
        private boolean finish;
        private LocalDate createDate;
        private List<Skill> requireSkills;
        private Location location;
        private int createUserId;
        private int asigneUserId;

        public TaskBuilder(){

        }

        public TaskBuilder withTitle(String title){
            this.title = title;
            return this;
        }
        public TaskBuilder withDescription(String description){
            this.description = description;
            return this;
        }
        public TaskBuilder withStatus(Status status){
            this.status = status;
            return this;
        }
        public TaskBuilder withPriority(Priority priority){
            this.priority = priority;
            return this;
        }
        public TaskBuilder withSummary(String summary){
            this.summary = summary;
            return this;
        }
        public TaskBuilder withFinishFlag(boolean finish){
            this.finish = finish;
            return this;
        }
        public TaskBuilder withRequireSkills(List skillsList){
            this.requireSkills = skillsList;
            return this;
        }
        public TaskBuilder withLocation(Location location){
            this.location = location;
            return this;
        }
        public TaskBuilder withAsigneUserId(int asigneUserId){
            this.asigneUserId = asigneUserId;
            return this;
        }

        public Task build(){
            Task task = new Task();
            task.title = this.title;
            task.description = this.description;
            task.status = this.status;
            task.priority = this.priority;
            task.summary = this.summary;
            task.finish = this.finish;
            task.requireSkills = this.requireSkills;
            task.location = this.location;
            task.asigneUserId = this.asigneUserId;
            return task;
        }
    }
}
