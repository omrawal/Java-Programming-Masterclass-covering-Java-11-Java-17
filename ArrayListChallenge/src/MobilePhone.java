import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList <Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts=new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact){
        if (findContact(contact) != -1) {
            return false;
        } else {
            return myContacts.add(contact);
        }
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        if(! myContacts.contains(oldContact)){
            return false;
        }
        else{
            myContacts.remove(oldContact);
            myContacts.add(newContact);
            return true;
        }
    }
    public boolean removeContact (Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }
    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    public int findContact(String contactName){
        for(int i=0;i<myContacts.size();i++){
            Contact contact =myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String contactName){
        for(int i=0;i<myContacts.size();i++){
            Contact contact=myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return contact;
            }
        }
        return null;
    }
    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
