package contracts;

public class CreateUserResponse {

    private String createdAt;

    private String name;

    private String id;

    private String job;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "ClassPojo [createdAt = " + createdAt + ", name = " + name + ", id = " + id + ", job = " + job + "]";
    }
}

