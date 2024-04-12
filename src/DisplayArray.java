public class DisplayArray {
    public static void main(String[] args){
        String[] names = {"Mary Akpan", "Nsibet Okon", "Olumide Lawal"};
        String[] address = {"Surulere", "Maryland", "Okota"};
        String[] position = {"Director", "Manager", "Chef"};

        System.out.println("Applicant Information:");
        System.out.println("----------------------");

        for(int i = 0; i<names.length; i++){
            System.out.println("Name: " + names[i]);
            System.out.println("Address: " + address[i]);
            System.out.println("Position: " + position[i]);
            System.out.println();
        }
    }
}
