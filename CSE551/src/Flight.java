public class Flight {
    int id;
    String source,destination;
    int dept,arr,capacity;

    public Flight(int id, String source, String destination, int dept, int arr, int capacity) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.dept = dept;
        this.arr = arr;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public int getArr() {
        return arr;
    }

    public void setArr(int arr) {
        this.arr = arr;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", dept=" + dept +
                ", arr=" + arr +
                ", capacity=" + capacity +
                '}';
    }
}
