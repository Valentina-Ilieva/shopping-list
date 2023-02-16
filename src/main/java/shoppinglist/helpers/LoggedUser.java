package shoppinglist.helpers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class LoggedUser {
    Long id;

    public boolean isEmpty(){
        return this.id==null;
    }

    public void clearUser(){
        this.id = null;
    }
}
