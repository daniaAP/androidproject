package ClASS;

import android.database.Cursor;

public interface SqlInterface {

     boolean Add();
     boolean Delete();
     boolean Update();
     Cursor Select();
}
