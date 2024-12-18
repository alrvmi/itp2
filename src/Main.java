public class Main {
    public static void main(String[] args) {

        Film film1 = new Film("Inception", "Christopher Nolan", 148);
        Film film2 = new Film("The Matrix", "The Wachowskis", 136);


        Viewer viewer1 = new Viewer("John Doe", 25, "johndoe@example.com");
        Viewer viewer2 = new Viewer("Jane Smith", 30, "janesmith@example.com");


        Cinema cinema1 = new Cinema("Central Cinema", "123 Main St", 5);
        Cinema cinema2 = new Cinema("Grand Cinema", "456 Broadway Ave", 8);


        System.out.println(film1);
        System.out.println(film2);
        System.out.println(viewer1);
        System.out.println(viewer2);
        System.out.println(cinema1);
        System.out.println(cinema2);


        System.out.println("Are the two cinemas the same? " + cinema1.equals(cinema2));
    }
}

class Film {
    private String title;
    private String director;
    private int duration;


    public Film(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Film [Title=" + title + ", Director=" + director + ", Duration=" + duration + " mins]";
    }
}

class Viewer {
    private String name;
    private int age;
    private String email;


    public Viewer(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Viewer [Name=" + name + ", Age=" + age + ", Email=" + email + "]";
    }
}

class Cinema {
    private String name;
    private String address;
    private int numberOfHalls;


    public Cinema(String name, String address, int numberOfHalls) {
        this.name = name;
        this.address = address;
        this.numberOfHalls = numberOfHalls;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }


    @Override
    public String toString() {
        return "Cinema [Name=" + name + ", Address=" + address + ", Number of Halls=" + numberOfHalls + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cinema cinema = (Cinema) obj;
        return name.equals(cinema.name) && address.equals(cinema.address);
    }
}
