package gr.aueb.cf.ch18.mobilecontacts.service;

import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactDTO;
import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.ContactNotFoundException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public interface IMobileContactService {
    /**
     * Creates {@link MobileContact} based on the data carried by the {@link MobileContactDTO}
     *
     * @param mobileContactDTO the DTO that contains the mobile contact data
     *
     * @return the resulting {@link MobileContact}
     *
     * @throws PhoneNumberAlreadyExistsException
     * if the {@link MobileContact} phoneNumber already exists in the datasource.
     *
     @throws UserIdAlreadyExistsException
      * if the {@link MobileContact} id already exists in the datasource.
     */
    MobileContact insertMobileContact(MobileContactDTO mobileContactDTO)
        throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;


    /**
     * Creates {@link MobileContact} based on the data carried by the {@link MobileContactDTO}
     *
     * @param mobileContactDTO the DTO that contains the mobile contact data
     *
     * @return the {@link MobileContact} before the update.
     *
     * @throws PhoneNumberAlreadyExistsException
     * if the {@link MobileContact} phoneNumber already exists in the datasource.
     *
     @throws ContactNotFoundException
      * if the {@link MobileContactDTO} mobileContactID does not map to a {@link MobileContact}
      * in the datasource.
     */
    MobileContact updateContact(MobileContactDTO mobileContactDTO)
        throws  PhoneNumberAlreadyExistsException, ContactNotFoundException;


    /**
     * Removes a {@link MobileContact}.
     *
     * @param phoneNumber the {@link MobileContact} phoneNumber needed to be removed.
     *
     * @throws ContactNotFoundException
     * if {@link MobileContact} phoneNumber does not map
     * to a {@link MobileContact} in the datasource.
     */
    void deleteContact(String phoneNumber) throws ContactNotFoundException;

    /**
     * Returns the {@link MobileContact} based on the input phone number.
     *
     * @param phoneNumber the {@link MobileContact} phoneNumber of the mobile contact instance
     *                    needed to be returned.
     *
     * @return the resulting {@link MobileContact}.
     *
     @throws ContactNotFoundException
      * if the {@link MobileContactDTO} phoneNumber does not map to a {@link MobileContact}
      * in the datasource.
     */
    MobileContact getContact(String phoneNumber) throws ContactNotFoundException;

    /**
     * Returns the {@link MobileContact} based on the input id.
     *
     * @param id the {@link MobileContact} id of the mobile contact instance
     *                    needed to be returned.
     *
     * @return the resulting {@link MobileContact}.
     *
     @throws ContactNotFoundException
      * if the {@link MobileContactDTO} id does not map to a {@link MobileContact}
      * in the datasource.
     */
    MobileContact getContact(Long id) throws ContactNotFoundException;

    /**
     * Returns all the {@link MobileContact} instances of the datasource.
     *
     * @return the resulting {@link List<MobileContact>}
     */
    List<MobileContact> getAllContacts();
}
