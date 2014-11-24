package com.molev.alex.service;

import java.util.List;

import com.molev.alex.form.Contact;
 
public interface ContactService 
{
     
    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}
