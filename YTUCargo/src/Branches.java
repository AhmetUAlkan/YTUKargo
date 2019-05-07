import java.io.FileNotFoundException;
import java.io.IOException;

public class Branches {
    private String branchName;
    int numberOfCargos = 0;
    Cargo[] cargos = new Cargo[numberOfCargos];

    Cargo findCargo(int cargoNo){
        return null;
    }
    boolean addCargo(int cargoNo, String fromWhere, String senderName, String senderPhone, String toWhere,
                     String destinationName, String destinationPhone, double weight) throws FileNotFoundException {
        if(numberOfCargos>100){
            return false;
        }
        Cargo cargo;
        if (weight<20){
            cargo = new sCargo(cargoNo, fromWhere, senderName,senderPhone,toWhere,
                    destinationName, destinationPhone, weight);
        }
        else if(weight<50){
            cargo = new mCargo(cargoNo, fromWhere, senderName,senderPhone,toWhere,
                    destinationName, destinationPhone, weight);
        }
        else {cargo = new lCargo(cargoNo, fromWhere, senderName,senderPhone,toWhere,
                    destinationName, destinationPhone, weight);
        }
        cargos[numberOfCargos] = cargo;
        numberOfCargos++;
        return true;
    }

    boolean deleteCargo(int cargoNo){
        int index = 0;
        for(int i=0; i<numberOfCargos; i++){
            if(cargos[i].getCargoNo()==cargoNo) {
                index = i;
                cargos = deleteElement(cargos, index);
                return true;
            }
        }

        return false;
    }

    private void findTime(Cargo cargo) throws IOException {
        cargo.findTime(cargo.getToWhere());
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Cargo[] deleteElement(Cargo[] arr, int index){
        if(arr == null || index < 0 || index >= arr.length){
            return arr;
        }
        Cargo[] temp = new Cargo[arr.length-1];

        for(int i =0, k = 0; i<arr.length; i++){

            if (i==index) continue;
            temp[k++] = arr[i];

        }
        return temp;

    }
}
