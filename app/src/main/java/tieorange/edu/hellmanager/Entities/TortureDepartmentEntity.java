package tieorange.edu.hellmanager.Entities;

import android.support.annotation.NonNull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;
import tieorange.edu.hellmanager.main.PunishmentTools.PunishmentTool;
import tieorange.edu.hellmanager.main.PunishmentTools.PunishmentToolComparator;
import tieorange.edu.hellmanager.main.SufferingProcess;
import tieorange.edu.hellmanager.main.Torturers.Torturer;

/**
 * Created by tieorange on 03/06/16.
 */

public class TortureDepartmentEntity extends RealmObject {
    @PrimaryKey
    private int id;
    @Required
    private String name;

//    private RealmList<SufferingProcess> sufferingProcesses = new HashSet<>(); // with an attribute
//    private Map<String, Torturer> torturersMap = new HashMap<>(); // qualified

    private RealmList<PunishmentToolEntity> punishmentTools;

}
