package top.daxianwill.frame.local.table;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WEATHERINFO_ENTITY".
*/
public class WeatherinfoEntityDao extends AbstractDao<WeatherinfoEntity, Long> {

    public static final String TABLENAME = "WEATHERINFO_ENTITY";

    /**
     * Properties of entity WeatherinfoEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property City = new Property(1, String.class, "city", false, "CITY");
        public final static Property Cityid = new Property(2, String.class, "cityid", false, "CITYID");
        public final static Property Temp = new Property(3, String.class, "temp", false, "TEMP");
        public final static Property WD = new Property(4, String.class, "WD", false, "WD");
        public final static Property WS = new Property(5, String.class, "WS", false, "WS");
        public final static Property SD = new Property(6, String.class, "SD", false, "SD");
        public final static Property WSE = new Property(7, String.class, "WSE", false, "WSE");
        public final static Property Time = new Property(8, String.class, "time", false, "TIME");
        public final static Property IsRadar = new Property(9, String.class, "isRadar", false, "IS_RADAR");
        public final static Property Radar = new Property(10, String.class, "Radar", false, "RADAR");
        public final static Property Njd = new Property(11, String.class, "njd", false, "NJD");
        public final static Property Qy = new Property(12, String.class, "qy", false, "QY");
    }


    public WeatherinfoEntityDao(DaoConfig config) {
        super(config);
    }
    
    public WeatherinfoEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WEATHERINFO_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"CITY\" TEXT," + // 1: city
                "\"CITYID\" TEXT," + // 2: cityid
                "\"TEMP\" TEXT," + // 3: temp
                "\"WD\" TEXT," + // 4: WD
                "\"WS\" TEXT," + // 5: WS
                "\"SD\" TEXT," + // 6: SD
                "\"WSE\" TEXT," + // 7: WSE
                "\"TIME\" TEXT," + // 8: time
                "\"IS_RADAR\" TEXT," + // 9: isRadar
                "\"RADAR\" TEXT," + // 10: Radar
                "\"NJD\" TEXT," + // 11: njd
                "\"QY\" TEXT);"); // 12: qy
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WEATHERINFO_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, WeatherinfoEntity entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(2, city);
        }
 
        String cityid = entity.getCityid();
        if (cityid != null) {
            stmt.bindString(3, cityid);
        }
 
        String temp = entity.getTemp();
        if (temp != null) {
            stmt.bindString(4, temp);
        }
 
        String WD = entity.getWD();
        if (WD != null) {
            stmt.bindString(5, WD);
        }
 
        String WS = entity.getWS();
        if (WS != null) {
            stmt.bindString(6, WS);
        }
 
        String SD = entity.getSD();
        if (SD != null) {
            stmt.bindString(7, SD);
        }
 
        String WSE = entity.getWSE();
        if (WSE != null) {
            stmt.bindString(8, WSE);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(9, time);
        }
 
        String isRadar = entity.getIsRadar();
        if (isRadar != null) {
            stmt.bindString(10, isRadar);
        }
 
        String Radar = entity.getRadar();
        if (Radar != null) {
            stmt.bindString(11, Radar);
        }
 
        String njd = entity.getNjd();
        if (njd != null) {
            stmt.bindString(12, njd);
        }
 
        String qy = entity.getQy();
        if (qy != null) {
            stmt.bindString(13, qy);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, WeatherinfoEntity entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(2, city);
        }
 
        String cityid = entity.getCityid();
        if (cityid != null) {
            stmt.bindString(3, cityid);
        }
 
        String temp = entity.getTemp();
        if (temp != null) {
            stmt.bindString(4, temp);
        }
 
        String WD = entity.getWD();
        if (WD != null) {
            stmt.bindString(5, WD);
        }
 
        String WS = entity.getWS();
        if (WS != null) {
            stmt.bindString(6, WS);
        }
 
        String SD = entity.getSD();
        if (SD != null) {
            stmt.bindString(7, SD);
        }
 
        String WSE = entity.getWSE();
        if (WSE != null) {
            stmt.bindString(8, WSE);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(9, time);
        }
 
        String isRadar = entity.getIsRadar();
        if (isRadar != null) {
            stmt.bindString(10, isRadar);
        }
 
        String Radar = entity.getRadar();
        if (Radar != null) {
            stmt.bindString(11, Radar);
        }
 
        String njd = entity.getNjd();
        if (njd != null) {
            stmt.bindString(12, njd);
        }
 
        String qy = entity.getQy();
        if (qy != null) {
            stmt.bindString(13, qy);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public WeatherinfoEntity readEntity(Cursor cursor, int offset) {
        WeatherinfoEntity entity = new WeatherinfoEntity( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // city
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // cityid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // temp
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // WD
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // WS
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // SD
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // WSE
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // time
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // isRadar
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // Radar
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // njd
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // qy
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, WeatherinfoEntity entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setCity(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCityid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTemp(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setWD(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setWS(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSD(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setWSE(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setTime(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setIsRadar(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setRadar(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setNjd(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setQy(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(WeatherinfoEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(WeatherinfoEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(WeatherinfoEntity entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
