/*************************************************************************
 *  Compilation:  javac HeartTransplant.java
 *  Execution:    java HeartTransplant < data.txt
 *
 *
 *************************************************************************/

public class HeartTransplant {

    /* ------ Instance variables  -------- */

    // Person array, each Person is read from the data file
    private Person[] listOfPatients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge[] survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause[] survivabilityByCause;

    /* ------ Constructor  -------- */
    
    /*
     * Initializes all instance variables to null.
     */
    public HeartTransplant() {

        Person[] listOfPatients = null;
        SurvivabilityByAge[] survivabilityByAge = null;
        SurvivabilityByCause[] survivabilityByCause = null;
        // WRITE YOUR CODE HERE
    }

    /* ------ Methods  -------- */

    /*
     * Inserts Person p into listOfPatients
     * 
     * Returns:  0 if successfully inserts p into array, 
     *          -1 if there is not enough space to insert p into array
     */
    public int addPerson(Person p, int arrayIndex) {

        int array_Length = listOfPatients.length;

        if (arrayIndex >= array_Length){
            return -1;
        }
        else{
            listOfPatients[arrayIndex] = p;
            return 0;
        }
    }

    /*
     * 1) Creates the listOfPatients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file.
     *    File Format: ID, Ethinicity, Gender, Age, Cause, Urgency, State of health
     *    Each line refers to one Person.
     * 
     * 3) Inserts each person from file into listOfPatients
     *    Hint: uses addPerson() method
     * 
     * Returns the number of patients read from file
     */
    public int readPersonsFromFile(int numberOfLines) {

        listOfPatients = new Person[numberOfLines];
        
        int Return_Number = 0;

        for (int i=0;i<numberOfLines;i++){

            int ID = StdIn.readInt();
            int Ethinicity = StdIn.readInt();
            int Gender = StdIn.readInt();
            int Age = StdIn.readInt();
            int Cause = StdIn.readInt();
            int Urgency = StdIn.readInt();
            int StateofHealth = StdIn.readInt();
            
            Person temp = new Person(ID, Ethinicity, Gender, Age, Cause, Urgency, StateofHealth);
            int check = addPerson(temp, i);
            if (check == -1){
                break;
            }
            Return_Number = i+1;

        }
        return Return_Number;
    }

    /*
     * 1) Creates the survivabilityByAge array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     * 3) Inserts each rate from file into the survivabilityByAge array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByAgeFromFile (int numberOfLines) {

        survivabilityByAge = new SurvivabilityByAge[numberOfLines];

        int Return_Number = 0;

        for (int i=0;i<numberOfLines;i++){

            int Age = StdIn.readInt();
            int YearsPostTransplant = StdIn.readInt();
            double Rate = StdIn.readDouble();

            SurvivabilityByAge temp = new SurvivabilityByAge(Age, YearsPostTransplant, Rate);
            survivabilityByAge[i] = temp;

            Return_Number = i+1;

        }
        return Return_Number;
    }

    /*
     * 1) Creates the survivabilityByCause array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     * 3) Inserts each rate from file into the survivabilityByCause array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByCauseFromFile (int numberOfLines) {

        survivabilityByCause = new SurvivabilityByCause[numberOfLines];

        int Return_Number = 0;

        for (int i=0;i<numberOfLines;i++){

            int Cause = StdIn.readInt();
            int YearsPostTransplant = StdIn.readInt();
            double Rate = StdIn.readDouble();

            SurvivabilityByCause temp = new SurvivabilityByCause(Cause, YearsPostTransplant, Rate);
            survivabilityByCause[i] = temp;

            Return_Number = i+1;

        }
        return Return_Number;
    }
    
    /*
     * Returns listOfPatients
     */
    public Person[] getListOfPatients() {
        return listOfPatients;
    } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge[] getSurvivabilityByAge() {
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause[] getSurvivabilityByCause() {
        return survivabilityByCause;
    }

    /*
     * Returns a Person array in which with every Person that has 
     * age above the parameter age from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with age above the parameter age.
     * 
     * Return null if there is no Person with age above the 
     * parameter age.
     */ 
    public Person[] getPatientsWithAgeAbove(int age) {

        int length = listOfPatients.length;
        int count = 0;

        for(int i=0;i<length;i++){

            int check_age = listOfPatients[i].getAge();
            if (check_age>age){
                count++;
            }
        }

        Person[] ReturnArray = new Person[count];

        if(count==0){
            return null;
        }
        else{
            int array_length = 0;
            for(int i=0;i<length;i++){
                
                int check_age = listOfPatients[i].getAge();
                if (check_age>age){
                    ReturnArray[array_length] = listOfPatients[i];
                    array_length++;
                }
            }
        }
        return ReturnArray;
    }
    
    /*
     * Returns a Person array with every Person that has the state of health 
     * equal to the parameter state from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the state of health equal to the parameter state.
     * 
     * Return null if there is no Person with the state of health 
     * equal to the parameter state.
     */ 
    public Person[] getPatientsByStateOfHealth(int state) {

        int length = listOfPatients.length;
        int count = 0;

        for(int i=0;i<length;i++){

            int check_health = listOfPatients[i].getStateOfHealth();
            if (check_health == state){
                count++;
            }
        }

        Person[] ReturnArray = new Person[count];

        if(count==0){
            return null;
        }
        else{
            int array_length = 0;
            for(int i=0;i<length;i++){
                
                int check_health = listOfPatients[i].getStateOfHealth();
                if (check_health == state){
                    ReturnArray[array_length] = listOfPatients[i];
                    array_length++;
                }
            }
        }
        return ReturnArray;

    }

    /*
     * Returns a Person array with every person that has the heart 
     * condition cause equal to the parameter cause from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Person with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Person[] getPatientsByHeartConditionCause(int cause) {

        int length = listOfPatients.length;
        int count = 0;

        for(int i=0;i<length;i++){

            int check_cause = listOfPatients[i].getCause();
            if (check_cause == cause){
                count++;
            }
        }

        Person[] ReturnArray = new Person[count];

        if(count==0){
            return null;
        }
        else{
            int array_length = 0;
            for(int i=0;i<length;i++){
                
                int check_cause = listOfPatients[i].getCause();
                if (check_cause == cause){
                    ReturnArray[array_length] = listOfPatients[i];
                    array_length++;
                }
            }
        }
        return ReturnArray;
    }

    /*
     * Assume there are numberOfHearts available for transplantation surgery.
     * Also assume that the hearts are of the same blood type as the
     * persons on the listOfPatients.
     * This method finds a set of persons to be the recepients of these
     * hearts.
     * 
     * The method returns a Person array from the listOfPatients
     * array that have the highest potential for survivability after
     * the transplant. The array size is numberOfHearts.
     * 
     * If numberOfHeartsAvailable is greater than listOfPatients
     * array size all Persons will receive a transplant.
     * 
     * If numberOfHeartsAvailable is smaller than listOfPatients
     * array size find the set of people with the highest
     * potential for survivability.
     * 
     * There is no correct solution, you may come up with any set of
     * persons from the listOfPatients array.
     */ 
    public Person[] match(int numberOfHearts) {

        int length = listOfPatients.length;
        Person[] ReturnArray = new Person[numberOfHearts];

        if(numberOfHearts>=length){
            return listOfPatients;
        }
        else{

            for(int i=0; i<length-1;i++){

                int min=i;

                for(int j=i+1;j<length;j++){
                    int j_val = listOfPatients[j].getAge();
                    int c_val = listOfPatients[min].getAge();
                    if(j_val<c_val){
                        min = j;
                    }
                }

                Person temp = listOfPatients[min];
                listOfPatients[min] = listOfPatients[i];
                listOfPatients[i] = temp;
            }

            for(int i=0;i<numberOfHearts;i++){
                ReturnArray[i] = listOfPatients[i];
            }
            return ReturnArray;
        }
    }

    /*
     * Client to test the methods you write
     */
    public static void main (String[] args) {

        HeartTransplant ht = new HeartTransplant();

        // read persons from file
        int numberOfLines = StdIn.readInt();
        int numberOfReadings = ht.readPersonsFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " patients read from file.");
 
        // read survivability by age from file
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByAgeFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by age lines read from file.");

        // read survivability by heart condition cause from file        
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByCauseFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by cause lines read from file.");

        /* list all patients
        for (Person p : ht.getListOfPatients()) {
            StdOut.println(p);
        }

        // list survivability by age rates
        for (SurvivabilityByAge rate : ht.getSurvivabilityByAge()) {
            StdOut.println(rate);
        }

        // list survivability by cause rates
        for (SurvivabilityByCause rate : ht.getSurvivabilityByCause()) {
            StdOut.println(rate);
        }*/

        
        for (Person p : ht.getPatientsWithAgeAbove(1000)) {
            StdOut.println(p);
        }

        /*
        for (Person p : ht.getPatientsByStateOfHealth(5)) {
            StdOut.println(p);
        }*/

        /*
        for (Person p : ht.getPatientsByHeartConditionCause(2)) {
            StdOut.println(p);
        }*/

        /*
        for (Person p : ht.match(50)) {
            StdOut.println(p);
        }*/

    }
}
