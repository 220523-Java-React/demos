package com.revature;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MOTDService {

    private List<String> messages = new ArrayList<>();

    private int defaultIndex;

    public String getMessage(int index){ // what if someone passes in 17...?

        if(index <= 4 && index >= 0){   // index is valid
            return messages.get(index); // what does this leave us vulnerable to? -> ArrayIndexOutOfBounds -> Unchecked
        } else {                        // index is not valid, so return the default
            return messages.get(defaultIndex);
        }
    }

    // Initialize this with an annotation
    @PostConstruct
    protected void initMotds(){
        messages.addAll(Arrays.asList(
                "Good Morning",
                "It seems impossible until it's done",
                "You always pass failure on your way to success",
                "Positive anything is better than negative nothing",
                "The first step of the journey is always the most difficult"
        ));
    }

    // Perform Setter injection with an annotation
    @Value("${some.key:4}")
    public void setDefaultIndex(int defaultIndex){
        this.defaultIndex = defaultIndex;
    }
}
