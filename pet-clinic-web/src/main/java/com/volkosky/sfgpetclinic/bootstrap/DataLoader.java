package com.volkosky.sfgpetclinic.bootstrap;

import com.volkosky.sfgpetclinic.model.Owner;
import com.volkosky.sfgpetclinic.model.Pet;
import com.volkosky.sfgpetclinic.model.PetType;
import com.volkosky.sfgpetclinic.model.Vet;
import com.volkosky.sfgpetclinic.services.OwnerService;
import com.volkosky.sfgpetclinic.services.PetTypeService;
import com.volkosky.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Ciul's street");
        owner1.setCity("Kostrzyń");
        owner1.setTelephone("0700880774");

        Pet mikesDog = new Pet();
        mikesDog.setName("Murzyn");
        mikesDog.setPetType(dog);
        mikesDog.setOwner(owner1);
        mikesDog.setBirthdate(LocalDate.now());
        owner1.getPets().add(mikesDog);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("124 Ciul's street");
        owner2.setCity("Kostrzyń");
        owner2.setTelephone("0700880775");

        Pet fionasCat = new Pet();
        fionasCat.setName("Sierściuch");
        fionasCat.setPetType(cat);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthdate(LocalDate.now());
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
