package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.Towermeta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Towermeta in entity cache.
 *
 * @author pj
 * @see Towermeta
 * @generated
 */
public class TowermetaCacheModel implements CacheModel<Towermeta>,
    Externalizable {
    public long samptime;
    public float H;
    public int H_EMEP;
    public int Qc_H;
    public int Qc_H_EMEP;
    public float LE;
    public int LE_EMEP;
    public int Qc_LE;
    public int Qc_LE_EMEP;
    public float E;
    public int E_EMEP;
    public int Qc_E;
    public int Qc_E_EMEP;
    public float F_c;
    public int F_c_EMEP;
    public int Qc_F_c;
    public int Qc_F_c_EMEP;
    public float tau;
    public int tau_EMEP;
    public int Qc_tau;
    public int Qc_tau_EMEP;
    public float u_star;
    public int u_star_EMEP;
    public float MO_length;
    public int MO_length_EMEP;
    public float std_u;
    public int std_u_EMEP;
    public float std_v;
    public int std_v_EMEP;
    public float std_w;
    public int std_w_EMEP;
    public float std_t;
    public int std_t_EMEP;
    public float std_c;
    public int std_c_EMEP;
    public float std_h;
    public int std_h_EMEP;
    public float av_u;
    public int av_u_EMEP;
    public float av_v;
    public int av_v_EMEP;
    public float av_w;
    public int av_w_EMEP;
    public float av_t;
    public int av_t_EMEP;
    public float av_c;
    public int av_c_EMEP;
    public float av_h;
    public int av_h_EMEP;
    public float U;
    public int U_EMEP;
    public float wind_dir;
    public int wind_dir_EMEP;
    public float eta;
    public int eta_EMEP;
    public float theta;
    public int theta_EMEP;
    public float beta;
    public int beta_EMEP;
    public float c_lag;
    public int c_lag_EMEP;
    public float h_lag;
    public int h_lag_EMEP;
    public float err_packet;
    public int err_packet_EMEP;
    public float licor_t_std;
    public int licor_t_std_EMEP;
    public float licor_t_av;
    public int licor_t_av_EMEP;
    public float licor_p_std;
    public int licor_p_std_EMEP;
    public float licor_p_av;
    public int licor_p_av_EMEP;
    public float F_CPC;
    public int F_CPC_EMEP;
    public int Qc_F_CPC;
    public int Qc_F_CPC_EMEP;
    public float std_CPC;
    public int std_CPC_EMEP;
    public float av_CPC;
    public int av_CPC_EMEP;
    public float CPC_lag;
    public int CPC_lag_EMEP;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(167);

        sb.append("{samptime=");
        sb.append(samptime);
        sb.append(", H=");
        sb.append(H);
        sb.append(", H_EMEP=");
        sb.append(H_EMEP);
        sb.append(", Qc_H=");
        sb.append(Qc_H);
        sb.append(", Qc_H_EMEP=");
        sb.append(Qc_H_EMEP);
        sb.append(", LE=");
        sb.append(LE);
        sb.append(", LE_EMEP=");
        sb.append(LE_EMEP);
        sb.append(", Qc_LE=");
        sb.append(Qc_LE);
        sb.append(", Qc_LE_EMEP=");
        sb.append(Qc_LE_EMEP);
        sb.append(", E=");
        sb.append(E);
        sb.append(", E_EMEP=");
        sb.append(E_EMEP);
        sb.append(", Qc_E=");
        sb.append(Qc_E);
        sb.append(", Qc_E_EMEP=");
        sb.append(Qc_E_EMEP);
        sb.append(", F_c=");
        sb.append(F_c);
        sb.append(", F_c_EMEP=");
        sb.append(F_c_EMEP);
        sb.append(", Qc_F_c=");
        sb.append(Qc_F_c);
        sb.append(", Qc_F_c_EMEP=");
        sb.append(Qc_F_c_EMEP);
        sb.append(", tau=");
        sb.append(tau);
        sb.append(", tau_EMEP=");
        sb.append(tau_EMEP);
        sb.append(", Qc_tau=");
        sb.append(Qc_tau);
        sb.append(", Qc_tau_EMEP=");
        sb.append(Qc_tau_EMEP);
        sb.append(", u_star=");
        sb.append(u_star);
        sb.append(", u_star_EMEP=");
        sb.append(u_star_EMEP);
        sb.append(", MO_length=");
        sb.append(MO_length);
        sb.append(", MO_length_EMEP=");
        sb.append(MO_length_EMEP);
        sb.append(", std_u=");
        sb.append(std_u);
        sb.append(", std_u_EMEP=");
        sb.append(std_u_EMEP);
        sb.append(", std_v=");
        sb.append(std_v);
        sb.append(", std_v_EMEP=");
        sb.append(std_v_EMEP);
        sb.append(", std_w=");
        sb.append(std_w);
        sb.append(", std_w_EMEP=");
        sb.append(std_w_EMEP);
        sb.append(", std_t=");
        sb.append(std_t);
        sb.append(", std_t_EMEP=");
        sb.append(std_t_EMEP);
        sb.append(", std_c=");
        sb.append(std_c);
        sb.append(", std_c_EMEP=");
        sb.append(std_c_EMEP);
        sb.append(", std_h=");
        sb.append(std_h);
        sb.append(", std_h_EMEP=");
        sb.append(std_h_EMEP);
        sb.append(", av_u=");
        sb.append(av_u);
        sb.append(", av_u_EMEP=");
        sb.append(av_u_EMEP);
        sb.append(", av_v=");
        sb.append(av_v);
        sb.append(", av_v_EMEP=");
        sb.append(av_v_EMEP);
        sb.append(", av_w=");
        sb.append(av_w);
        sb.append(", av_w_EMEP=");
        sb.append(av_w_EMEP);
        sb.append(", av_t=");
        sb.append(av_t);
        sb.append(", av_t_EMEP=");
        sb.append(av_t_EMEP);
        sb.append(", av_c=");
        sb.append(av_c);
        sb.append(", av_c_EMEP=");
        sb.append(av_c_EMEP);
        sb.append(", av_h=");
        sb.append(av_h);
        sb.append(", av_h_EMEP=");
        sb.append(av_h_EMEP);
        sb.append(", U=");
        sb.append(U);
        sb.append(", U_EMEP=");
        sb.append(U_EMEP);
        sb.append(", wind_dir=");
        sb.append(wind_dir);
        sb.append(", wind_dir_EMEP=");
        sb.append(wind_dir_EMEP);
        sb.append(", eta=");
        sb.append(eta);
        sb.append(", eta_EMEP=");
        sb.append(eta_EMEP);
        sb.append(", theta=");
        sb.append(theta);
        sb.append(", theta_EMEP=");
        sb.append(theta_EMEP);
        sb.append(", beta=");
        sb.append(beta);
        sb.append(", beta_EMEP=");
        sb.append(beta_EMEP);
        sb.append(", c_lag=");
        sb.append(c_lag);
        sb.append(", c_lag_EMEP=");
        sb.append(c_lag_EMEP);
        sb.append(", h_lag=");
        sb.append(h_lag);
        sb.append(", h_lag_EMEP=");
        sb.append(h_lag_EMEP);
        sb.append(", err_packet=");
        sb.append(err_packet);
        sb.append(", err_packet_EMEP=");
        sb.append(err_packet_EMEP);
        sb.append(", licor_t_std=");
        sb.append(licor_t_std);
        sb.append(", licor_t_std_EMEP=");
        sb.append(licor_t_std_EMEP);
        sb.append(", licor_t_av=");
        sb.append(licor_t_av);
        sb.append(", licor_t_av_EMEP=");
        sb.append(licor_t_av_EMEP);
        sb.append(", licor_p_std=");
        sb.append(licor_p_std);
        sb.append(", licor_p_std_EMEP=");
        sb.append(licor_p_std_EMEP);
        sb.append(", licor_p_av=");
        sb.append(licor_p_av);
        sb.append(", licor_p_av_EMEP=");
        sb.append(licor_p_av_EMEP);
        sb.append(", F_CPC=");
        sb.append(F_CPC);
        sb.append(", F_CPC_EMEP=");
        sb.append(F_CPC_EMEP);
        sb.append(", Qc_F_CPC=");
        sb.append(Qc_F_CPC);
        sb.append(", Qc_F_CPC_EMEP=");
        sb.append(Qc_F_CPC_EMEP);
        sb.append(", std_CPC=");
        sb.append(std_CPC);
        sb.append(", std_CPC_EMEP=");
        sb.append(std_CPC_EMEP);
        sb.append(", av_CPC=");
        sb.append(av_CPC);
        sb.append(", av_CPC_EMEP=");
        sb.append(av_CPC_EMEP);
        sb.append(", CPC_lag=");
        sb.append(CPC_lag);
        sb.append(", CPC_lag_EMEP=");
        sb.append(CPC_lag_EMEP);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Towermeta toEntityModel() {
        TowermetaImpl towermetaImpl = new TowermetaImpl();

        if (samptime == Long.MIN_VALUE) {
            towermetaImpl.setSamptime(null);
        } else {
            towermetaImpl.setSamptime(new Date(samptime));
        }

        towermetaImpl.setH(H);
        towermetaImpl.setH_EMEP(H_EMEP);
        towermetaImpl.setQc_H(Qc_H);
        towermetaImpl.setQc_H_EMEP(Qc_H_EMEP);
        towermetaImpl.setLE(LE);
        towermetaImpl.setLE_EMEP(LE_EMEP);
        towermetaImpl.setQc_LE(Qc_LE);
        towermetaImpl.setQc_LE_EMEP(Qc_LE_EMEP);
        towermetaImpl.setE(E);
        towermetaImpl.setE_EMEP(E_EMEP);
        towermetaImpl.setQc_E(Qc_E);
        towermetaImpl.setQc_E_EMEP(Qc_E_EMEP);
        towermetaImpl.setF_c(F_c);
        towermetaImpl.setF_c_EMEP(F_c_EMEP);
        towermetaImpl.setQc_F_c(Qc_F_c);
        towermetaImpl.setQc_F_c_EMEP(Qc_F_c_EMEP);
        towermetaImpl.setTau(tau);
        towermetaImpl.setTau_EMEP(tau_EMEP);
        towermetaImpl.setQc_tau(Qc_tau);
        towermetaImpl.setQc_tau_EMEP(Qc_tau_EMEP);
        towermetaImpl.setU_star(u_star);
        towermetaImpl.setU_star_EMEP(u_star_EMEP);
        towermetaImpl.setMO_length(MO_length);
        towermetaImpl.setMO_length_EMEP(MO_length_EMEP);
        towermetaImpl.setStd_u(std_u);
        towermetaImpl.setStd_u_EMEP(std_u_EMEP);
        towermetaImpl.setStd_v(std_v);
        towermetaImpl.setStd_v_EMEP(std_v_EMEP);
        towermetaImpl.setStd_w(std_w);
        towermetaImpl.setStd_w_EMEP(std_w_EMEP);
        towermetaImpl.setStd_t(std_t);
        towermetaImpl.setStd_t_EMEP(std_t_EMEP);
        towermetaImpl.setStd_c(std_c);
        towermetaImpl.setStd_c_EMEP(std_c_EMEP);
        towermetaImpl.setStd_h(std_h);
        towermetaImpl.setStd_h_EMEP(std_h_EMEP);
        towermetaImpl.setAv_u(av_u);
        towermetaImpl.setAv_u_EMEP(av_u_EMEP);
        towermetaImpl.setAv_v(av_v);
        towermetaImpl.setAv_v_EMEP(av_v_EMEP);
        towermetaImpl.setAv_w(av_w);
        towermetaImpl.setAv_w_EMEP(av_w_EMEP);
        towermetaImpl.setAv_t(av_t);
        towermetaImpl.setAv_t_EMEP(av_t_EMEP);
        towermetaImpl.setAv_c(av_c);
        towermetaImpl.setAv_c_EMEP(av_c_EMEP);
        towermetaImpl.setAv_h(av_h);
        towermetaImpl.setAv_h_EMEP(av_h_EMEP);
        towermetaImpl.setU(U);
        towermetaImpl.setU_EMEP(U_EMEP);
        towermetaImpl.setWind_dir(wind_dir);
        towermetaImpl.setWind_dir_EMEP(wind_dir_EMEP);
        towermetaImpl.setEta(eta);
        towermetaImpl.setEta_EMEP(eta_EMEP);
        towermetaImpl.setTheta(theta);
        towermetaImpl.setTheta_EMEP(theta_EMEP);
        towermetaImpl.setBeta(beta);
        towermetaImpl.setBeta_EMEP(beta_EMEP);
        towermetaImpl.setC_lag(c_lag);
        towermetaImpl.setC_lag_EMEP(c_lag_EMEP);
        towermetaImpl.setH_lag(h_lag);
        towermetaImpl.setH_lag_EMEP(h_lag_EMEP);
        towermetaImpl.setErr_packet(err_packet);
        towermetaImpl.setErr_packet_EMEP(err_packet_EMEP);
        towermetaImpl.setLicor_t_std(licor_t_std);
        towermetaImpl.setLicor_t_std_EMEP(licor_t_std_EMEP);
        towermetaImpl.setLicor_t_av(licor_t_av);
        towermetaImpl.setLicor_t_av_EMEP(licor_t_av_EMEP);
        towermetaImpl.setLicor_p_std(licor_p_std);
        towermetaImpl.setLicor_p_std_EMEP(licor_p_std_EMEP);
        towermetaImpl.setLicor_p_av(licor_p_av);
        towermetaImpl.setLicor_p_av_EMEP(licor_p_av_EMEP);
        towermetaImpl.setF_CPC(F_CPC);
        towermetaImpl.setF_CPC_EMEP(F_CPC_EMEP);
        towermetaImpl.setQc_F_CPC(Qc_F_CPC);
        towermetaImpl.setQc_F_CPC_EMEP(Qc_F_CPC_EMEP);
        towermetaImpl.setStd_CPC(std_CPC);
        towermetaImpl.setStd_CPC_EMEP(std_CPC_EMEP);
        towermetaImpl.setAv_CPC(av_CPC);
        towermetaImpl.setAv_CPC_EMEP(av_CPC_EMEP);
        towermetaImpl.setCPC_lag(CPC_lag);
        towermetaImpl.setCPC_lag_EMEP(CPC_lag_EMEP);

        towermetaImpl.resetOriginalValues();

        return towermetaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        samptime = objectInput.readLong();
        H = objectInput.readFloat();
        H_EMEP = objectInput.readInt();
        Qc_H = objectInput.readInt();
        Qc_H_EMEP = objectInput.readInt();
        LE = objectInput.readFloat();
        LE_EMEP = objectInput.readInt();
        Qc_LE = objectInput.readInt();
        Qc_LE_EMEP = objectInput.readInt();
        E = objectInput.readFloat();
        E_EMEP = objectInput.readInt();
        Qc_E = objectInput.readInt();
        Qc_E_EMEP = objectInput.readInt();
        F_c = objectInput.readFloat();
        F_c_EMEP = objectInput.readInt();
        Qc_F_c = objectInput.readInt();
        Qc_F_c_EMEP = objectInput.readInt();
        tau = objectInput.readFloat();
        tau_EMEP = objectInput.readInt();
        Qc_tau = objectInput.readInt();
        Qc_tau_EMEP = objectInput.readInt();
        u_star = objectInput.readFloat();
        u_star_EMEP = objectInput.readInt();
        MO_length = objectInput.readFloat();
        MO_length_EMEP = objectInput.readInt();
        std_u = objectInput.readFloat();
        std_u_EMEP = objectInput.readInt();
        std_v = objectInput.readFloat();
        std_v_EMEP = objectInput.readInt();
        std_w = objectInput.readFloat();
        std_w_EMEP = objectInput.readInt();
        std_t = objectInput.readFloat();
        std_t_EMEP = objectInput.readInt();
        std_c = objectInput.readFloat();
        std_c_EMEP = objectInput.readInt();
        std_h = objectInput.readFloat();
        std_h_EMEP = objectInput.readInt();
        av_u = objectInput.readFloat();
        av_u_EMEP = objectInput.readInt();
        av_v = objectInput.readFloat();
        av_v_EMEP = objectInput.readInt();
        av_w = objectInput.readFloat();
        av_w_EMEP = objectInput.readInt();
        av_t = objectInput.readFloat();
        av_t_EMEP = objectInput.readInt();
        av_c = objectInput.readFloat();
        av_c_EMEP = objectInput.readInt();
        av_h = objectInput.readFloat();
        av_h_EMEP = objectInput.readInt();
        U = objectInput.readFloat();
        U_EMEP = objectInput.readInt();
        wind_dir = objectInput.readFloat();
        wind_dir_EMEP = objectInput.readInt();
        eta = objectInput.readFloat();
        eta_EMEP = objectInput.readInt();
        theta = objectInput.readFloat();
        theta_EMEP = objectInput.readInt();
        beta = objectInput.readFloat();
        beta_EMEP = objectInput.readInt();
        c_lag = objectInput.readFloat();
        c_lag_EMEP = objectInput.readInt();
        h_lag = objectInput.readFloat();
        h_lag_EMEP = objectInput.readInt();
        err_packet = objectInput.readFloat();
        err_packet_EMEP = objectInput.readInt();
        licor_t_std = objectInput.readFloat();
        licor_t_std_EMEP = objectInput.readInt();
        licor_t_av = objectInput.readFloat();
        licor_t_av_EMEP = objectInput.readInt();
        licor_p_std = objectInput.readFloat();
        licor_p_std_EMEP = objectInput.readInt();
        licor_p_av = objectInput.readFloat();
        licor_p_av_EMEP = objectInput.readInt();
        F_CPC = objectInput.readFloat();
        F_CPC_EMEP = objectInput.readInt();
        Qc_F_CPC = objectInput.readInt();
        Qc_F_CPC_EMEP = objectInput.readInt();
        std_CPC = objectInput.readFloat();
        std_CPC_EMEP = objectInput.readInt();
        av_CPC = objectInput.readFloat();
        av_CPC_EMEP = objectInput.readInt();
        CPC_lag = objectInput.readFloat();
        CPC_lag_EMEP = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(samptime);
        objectOutput.writeFloat(H);
        objectOutput.writeInt(H_EMEP);
        objectOutput.writeInt(Qc_H);
        objectOutput.writeInt(Qc_H_EMEP);
        objectOutput.writeFloat(LE);
        objectOutput.writeInt(LE_EMEP);
        objectOutput.writeInt(Qc_LE);
        objectOutput.writeInt(Qc_LE_EMEP);
        objectOutput.writeFloat(E);
        objectOutput.writeInt(E_EMEP);
        objectOutput.writeInt(Qc_E);
        objectOutput.writeInt(Qc_E_EMEP);
        objectOutput.writeFloat(F_c);
        objectOutput.writeInt(F_c_EMEP);
        objectOutput.writeInt(Qc_F_c);
        objectOutput.writeInt(Qc_F_c_EMEP);
        objectOutput.writeFloat(tau);
        objectOutput.writeInt(tau_EMEP);
        objectOutput.writeInt(Qc_tau);
        objectOutput.writeInt(Qc_tau_EMEP);
        objectOutput.writeFloat(u_star);
        objectOutput.writeInt(u_star_EMEP);
        objectOutput.writeFloat(MO_length);
        objectOutput.writeInt(MO_length_EMEP);
        objectOutput.writeFloat(std_u);
        objectOutput.writeInt(std_u_EMEP);
        objectOutput.writeFloat(std_v);
        objectOutput.writeInt(std_v_EMEP);
        objectOutput.writeFloat(std_w);
        objectOutput.writeInt(std_w_EMEP);
        objectOutput.writeFloat(std_t);
        objectOutput.writeInt(std_t_EMEP);
        objectOutput.writeFloat(std_c);
        objectOutput.writeInt(std_c_EMEP);
        objectOutput.writeFloat(std_h);
        objectOutput.writeInt(std_h_EMEP);
        objectOutput.writeFloat(av_u);
        objectOutput.writeInt(av_u_EMEP);
        objectOutput.writeFloat(av_v);
        objectOutput.writeInt(av_v_EMEP);
        objectOutput.writeFloat(av_w);
        objectOutput.writeInt(av_w_EMEP);
        objectOutput.writeFloat(av_t);
        objectOutput.writeInt(av_t_EMEP);
        objectOutput.writeFloat(av_c);
        objectOutput.writeInt(av_c_EMEP);
        objectOutput.writeFloat(av_h);
        objectOutput.writeInt(av_h_EMEP);
        objectOutput.writeFloat(U);
        objectOutput.writeInt(U_EMEP);
        objectOutput.writeFloat(wind_dir);
        objectOutput.writeInt(wind_dir_EMEP);
        objectOutput.writeFloat(eta);
        objectOutput.writeInt(eta_EMEP);
        objectOutput.writeFloat(theta);
        objectOutput.writeInt(theta_EMEP);
        objectOutput.writeFloat(beta);
        objectOutput.writeInt(beta_EMEP);
        objectOutput.writeFloat(c_lag);
        objectOutput.writeInt(c_lag_EMEP);
        objectOutput.writeFloat(h_lag);
        objectOutput.writeInt(h_lag_EMEP);
        objectOutput.writeFloat(err_packet);
        objectOutput.writeInt(err_packet_EMEP);
        objectOutput.writeFloat(licor_t_std);
        objectOutput.writeInt(licor_t_std_EMEP);
        objectOutput.writeFloat(licor_t_av);
        objectOutput.writeInt(licor_t_av_EMEP);
        objectOutput.writeFloat(licor_p_std);
        objectOutput.writeInt(licor_p_std_EMEP);
        objectOutput.writeFloat(licor_p_av);
        objectOutput.writeInt(licor_p_av_EMEP);
        objectOutput.writeFloat(F_CPC);
        objectOutput.writeInt(F_CPC_EMEP);
        objectOutput.writeInt(Qc_F_CPC);
        objectOutput.writeInt(Qc_F_CPC_EMEP);
        objectOutput.writeFloat(std_CPC);
        objectOutput.writeInt(std_CPC_EMEP);
        objectOutput.writeFloat(av_CPC);
        objectOutput.writeInt(av_CPC_EMEP);
        objectOutput.writeFloat(CPC_lag);
        objectOutput.writeInt(CPC_lag_EMEP);
    }
}