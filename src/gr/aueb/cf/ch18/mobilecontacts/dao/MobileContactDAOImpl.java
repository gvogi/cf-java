package gr.aueb.cf.ch18.mobilecontacts.dao;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

import java.util.ArrayList;
import java.util.List;

/**
 * The DAO layer class implements the proxy Design pattern.
 */
public class MobileContactDAOImpl implements IMobileContactDAO {
    private static final List<MobileContact> contacts = new ArrayList<>();

    @Override
    public MobileContact insert(MobileContact mobileContact) {
        contacts.add(mobileContact);
        return mobileContact;
    }

    @Override
    public MobileContact update(MobileContact mobileContact) {
        return contacts.set(contacts.indexOf(mobileContact), mobileContact);
    }

    @Override
    public void delete(String phoneNumber) {
        contacts.removeIf((contact) -> contact.getPhoneNumber().equals(phoneNumber));
    }

    @Override
    public void delete(Long id) {
        contacts.removeIf((contact) -> contact.getId().equals(id));
    }

    @Override
    public MobileContact get(Long id) {
        int pos = getIndexById(id);
        if (pos == -1) return null;
        return contacts.get(pos);
    }

    @Override
    public MobileContact get(String phoneNumber) {
        int pos = getIndexByPhoneNumber(phoneNumber);
        if (pos == -1) return null;
        return contacts.get(pos);
    }

    @Override
    public List<MobileContact> getAll() {
        return new ArrayList<>(contacts);
    }

    @Override
    public boolean phoneNumberExists(String phoneNumber) {
        return getIndexByPhoneNumber(phoneNumber) != -1;
    }

    @Override
    public boolean userIdExists(Long id) {
        return getIndexById(id) != -1;
    }

    /**
     * Returns the position in the array list datasource of the
     * {@link MobileContact} containing the id.
     *
     * @param id the {@link MobileContact} id to be searched.
     *
     * @return the resulting position, or -1, if the id is not found.
     */
    private int getIndexById(Long id) {
        int pos = -1;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId().equals(id)){
                pos = i;
                break;
            }
        }

        return pos;
    }

    /**
     * Returns the position in the array list datasource of the
     * {@link MobileContact} containing the <code>phoneNumber</code>.
     *
     * @param phoneNumber the {@link MobileContact} phoneNumber to be searched.
     *
     * @return the resulting position, or -1, if the phoneNumber is not found.
     */
    private int getIndexByPhoneNumber(String phoneNumber) {
        int pos = -1;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)){
                pos = i;
                break;
            }
        }

        return pos;
    }
}
