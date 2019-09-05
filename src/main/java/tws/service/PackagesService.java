package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.Packages;
import tws.repository.PackagesMapper;

import java.util.List;

@Service
public class PackagesService {
    @Autowired
    PackagesMapper packagesMapper;
    public void addPackages(Packages packages){
        packagesMapper.insert(packages);
    }
    public List<Packages> getAllPackages(){
        return packagesMapper.selectAll();
    }
}
