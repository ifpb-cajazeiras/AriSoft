package br.edu.ifpb.pos.webapp.controller.forms;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class MultiplasImagensForm {

    List<MultipartFile> files;

    public List<MultipartFile> getFiles() {
        return files;
    }

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }
    
}
