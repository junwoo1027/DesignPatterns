package design._05_prototype;

import java.util.Objects;

public class GithubIssue implements Cloneable {

    private GithubRepository githubRepository;

    public GithubIssue(GithubRepository githubRepository) {
        this.githubRepository = githubRepository;
    }

    private int id;

    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getGithubRepository() {
        return githubRepository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                githubRepository.getUser(),
                githubRepository.getName(),
                this.getId());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); //shallow

        //deep copy
        GithubRepository repository = new GithubRepository();
        repository.setUser(this.githubRepository.getUser());
        repository.setName(this.githubRepository.getName());

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(this.id);
        githubIssue.setTitle(this.title);

        return githubIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(githubRepository, that.githubRepository) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(githubRepository, id, title);
    }
}
