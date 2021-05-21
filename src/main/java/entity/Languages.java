package entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;
import java.util.Objects;

public class Languages {
    @JsonProperty("english")
    private List<English> english;
    @JsonProperty("dutch")
    private List<Dutch> dutch;

    public Languages() {
    }


}
