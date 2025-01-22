package cse.basic.lld;

import java.util.List;

public interface Procedure {
    void register(OutPatient outPatient);
    List<OutPatient> viewPatients();
    List<OutPatient> viewObese();
}
