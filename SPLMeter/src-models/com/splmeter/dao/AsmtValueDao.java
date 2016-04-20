package com.splmeter.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.splmeter.entities.AsmtValue;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ASMT_VALUE".
*/
public class AsmtValueDao extends AbstractDao<AsmtValue, Long> {

    public static final String TABLENAME = "ASMT_VALUE";

    /**
     * Properties of entity AsmtValue.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Imei = new Property(1, String.class, "imei", false, "IMEI");
        public final static Property Modeltype = new Property(2, String.class, "modeltype", false, "MODELTYPE");
        public final static Property Mode = new Property(3, String.class, "mode", false, "MODE");
        public final static Property Source = new Property(4, String.class, "source", false, "SOURCE");
        public final static Property Asmt = new Property(5, String.class, "asmt", false, "ASMT");
        public final static Property Gender = new Property(6, Integer.class, "gender", false, "GENDER");
        public final static Property Age = new Property(7, Integer.class, "age", false, "AGE");
        public final static Property MF = new Property(8, Float.class, "mF", false, "M_F");
        public final static Property MLpa = new Property(9, Float.class, "mLpa", false, "M_LPA");
        public final static Property L10 = new Property(10, Float.class, "l10", false, "L10");
        public final static Property L50 = new Property(11, Float.class, "l50", false, "L50");
        public final static Property L90 = new Property(12, Float.class, "l90", false, "L90");
        public final static Property Laeq = new Property(13, Float.class, "laeq", false, "LAEQ");
        public final static Property Calb = new Property(14, Float.class, "calb", false, "CALB");
        public final static Property Post = new Property(15, Integer.class, "post", false, "POST");
    };

    private DaoSession daoSession;


    public AsmtValueDao(DaoConfig config) {
        super(config);
    }
    
    public AsmtValueDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ASMT_VALUE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"IMEI\" TEXT," + // 1: imei
                "\"MODELTYPE\" TEXT," + // 2: modeltype
                "\"MODE\" TEXT," + // 3: mode
                "\"SOURCE\" TEXT," + // 4: source
                "\"ASMT\" TEXT," + // 5: asmt
                "\"GENDER\" INTEGER," + // 6: gender
                "\"AGE\" INTEGER," + // 7: age
                "\"M_F\" REAL," + // 8: mF
                "\"M_LPA\" REAL," + // 9: mLpa
                "\"L10\" REAL," + // 10: l10
                "\"L50\" REAL," + // 11: l50
                "\"L90\" REAL," + // 12: l90
                "\"LAEQ\" REAL," + // 13: laeq
                "\"CALB\" REAL," + // 14: calb
                "\"POST\" INTEGER);"); // 15: post
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ASMT_VALUE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, AsmtValue entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String imei = entity.getImei();
        if (imei != null) {
            stmt.bindString(2, imei);
        }
 
        String modeltype = entity.getModeltype();
        if (modeltype != null) {
            stmt.bindString(3, modeltype);
        }
 
        String mode = entity.getMode();
        if (mode != null) {
            stmt.bindString(4, mode);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(5, source);
        }
 
        String asmt = entity.getAsmt();
        if (asmt != null) {
            stmt.bindString(6, asmt);
        }
 
        Integer gender = entity.getGender();
        if (gender != null) {
            stmt.bindLong(7, gender);
        }
 
        Integer age = entity.getAge();
        if (age != null) {
            stmt.bindLong(8, age);
        }
 
        Float mF = entity.getMF();
        if (mF != null) {
            stmt.bindDouble(9, mF);
        }
 
        Float mLpa = entity.getMLpa();
        if (mLpa != null) {
            stmt.bindDouble(10, mLpa);
        }
 
        Float l10 = entity.getL10();
        if (l10 != null) {
            stmt.bindDouble(11, l10);
        }
 
        Float l50 = entity.getL50();
        if (l50 != null) {
            stmt.bindDouble(12, l50);
        }
 
        Float l90 = entity.getL90();
        if (l90 != null) {
            stmt.bindDouble(13, l90);
        }
 
        Float laeq = entity.getLaeq();
        if (laeq != null) {
            stmt.bindDouble(14, laeq);
        }
 
        Float calb = entity.getCalb();
        if (calb != null) {
            stmt.bindDouble(15, calb);
        }
 
        Integer post = entity.getPost();
        if (post != null) {
            stmt.bindLong(16, post);
        }
    }

    @Override
    protected void attachEntity(AsmtValue entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public AsmtValue readEntity(Cursor cursor, int offset) {
        AsmtValue entity = new AsmtValue( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // imei
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // modeltype
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // mode
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // source
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // asmt
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // gender
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // age
            cursor.isNull(offset + 8) ? null : cursor.getFloat(offset + 8), // mF
            cursor.isNull(offset + 9) ? null : cursor.getFloat(offset + 9), // mLpa
            cursor.isNull(offset + 10) ? null : cursor.getFloat(offset + 10), // l10
            cursor.isNull(offset + 11) ? null : cursor.getFloat(offset + 11), // l50
            cursor.isNull(offset + 12) ? null : cursor.getFloat(offset + 12), // l90
            cursor.isNull(offset + 13) ? null : cursor.getFloat(offset + 13), // laeq
            cursor.isNull(offset + 14) ? null : cursor.getFloat(offset + 14), // calb
            cursor.isNull(offset + 15) ? null : cursor.getInt(offset + 15) // post
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, AsmtValue entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setImei(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setModeltype(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMode(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSource(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAsmt(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setGender(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setAge(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setMF(cursor.isNull(offset + 8) ? null : cursor.getFloat(offset + 8));
        entity.setMLpa(cursor.isNull(offset + 9) ? null : cursor.getFloat(offset + 9));
        entity.setL10(cursor.isNull(offset + 10) ? null : cursor.getFloat(offset + 10));
        entity.setL50(cursor.isNull(offset + 11) ? null : cursor.getFloat(offset + 11));
        entity.setL90(cursor.isNull(offset + 12) ? null : cursor.getFloat(offset + 12));
        entity.setLaeq(cursor.isNull(offset + 13) ? null : cursor.getFloat(offset + 13));
        entity.setCalb(cursor.isNull(offset + 14) ? null : cursor.getFloat(offset + 14));
        entity.setPost(cursor.isNull(offset + 15) ? null : cursor.getInt(offset + 15));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(AsmtValue entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(AsmtValue entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
