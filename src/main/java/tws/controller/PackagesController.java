package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Packages;
import tws.service.PackagesService;


import java.net.URI;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/packages")
public class PackagesController {

    @Autowired
    private PackagesService packagesService;

    @GetMapping("/packages")
    public ResponseEntity<List<Packages>> getAllPackages() {

        return ResponseEntity.ok(packagesService.getAllPackages());
    }

    @PostMapping("")
    public ResponseEntity<Packages> insert(@RequestBody Packages packages) {
       packagesService.addPackages(packages);
        return ResponseEntity.created(URI.create("/packages/" + packages.getPackageId())).body(packages);
    }
}
