package fi.csc.smear.db.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Hyde_eddy233 service. Represents a row in the &quot;HYY_EDDY233&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.smear.db.model.impl.Hyde_eddy233ModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.smear.db.model.impl.Hyde_eddy233Impl}.
 * </p>
 *
 * @author pj
 * @see Hyde_eddy233
 * @see fi.csc.smear.db.model.impl.Hyde_eddy233Impl
 * @see fi.csc.smear.db.model.impl.Hyde_eddy233ModelImpl
 * @generated
 */
public interface Hyde_eddy233Model extends BaseModel<Hyde_eddy233> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a hyde_eddy233 model instance should use the {@link Hyde_eddy233} interface instead.
     */

    /**
     * Returns the primary key of this hyde_eddy233.
     *
     * @return the primary key of this hyde_eddy233
     */
    public java.util.Date getPrimaryKey();

    /**
     * Sets the primary key of this hyde_eddy233.
     *
     * @param primaryKey the primary key of this hyde_eddy233
     */
    public void setPrimaryKey(java.util.Date primaryKey);

    /**
     * Returns the samptime of this hyde_eddy233.
     *
     * @return the samptime of this hyde_eddy233
     */
    public Date getSamptime();

    /**
     * Sets the samptime of this hyde_eddy233.
     *
     * @param samptime the samptime of this hyde_eddy233
     */
    public void setSamptime(Date samptime);

    /**
     * Returns the h of this hyde_eddy233.
     *
     * @return the h of this hyde_eddy233
     */
    public float getH();

    /**
     * Sets the h of this hyde_eddy233.
     *
     * @param H the h of this hyde_eddy233
     */
    public void setH(float H);

    /**
     * Returns the l e of this hyde_eddy233.
     *
     * @return the l e of this hyde_eddy233
     */
    public float getLE();

    /**
     * Sets the l e of this hyde_eddy233.
     *
     * @param LE the l e of this hyde_eddy233
     */
    public void setLE(float LE);

    /**
     * Returns the e of this hyde_eddy233.
     *
     * @return the e of this hyde_eddy233
     */
    public float getE();

    /**
     * Sets the e of this hyde_eddy233.
     *
     * @param E the e of this hyde_eddy233
     */
    public void setE(float E);

    /**
     * Returns the f_c of this hyde_eddy233.
     *
     * @return the f_c of this hyde_eddy233
     */
    public float getF_c();

    /**
     * Sets the f_c of this hyde_eddy233.
     *
     * @param F_c the f_c of this hyde_eddy233
     */
    public void setF_c(float F_c);

    /**
     * Returns the tau of this hyde_eddy233.
     *
     * @return the tau of this hyde_eddy233
     */
    public float getTau();

    /**
     * Sets the tau of this hyde_eddy233.
     *
     * @param tau the tau of this hyde_eddy233
     */
    public void setTau(float tau);

    /**
     * Returns the u_star of this hyde_eddy233.
     *
     * @return the u_star of this hyde_eddy233
     */
    public float getU_star();

    /**
     * Sets the u_star of this hyde_eddy233.
     *
     * @param u_star the u_star of this hyde_eddy233
     */
    public void setU_star(float u_star);

    /**
     * Returns the m o_length of this hyde_eddy233.
     *
     * @return the m o_length of this hyde_eddy233
     */
    public float getMO_length();

    /**
     * Sets the m o_length of this hyde_eddy233.
     *
     * @param MO_length the m o_length of this hyde_eddy233
     */
    public void setMO_length(float MO_length);

    /**
     * Returns the std_u of this hyde_eddy233.
     *
     * @return the std_u of this hyde_eddy233
     */
    public float getStd_u();

    /**
     * Sets the std_u of this hyde_eddy233.
     *
     * @param std_u the std_u of this hyde_eddy233
     */
    public void setStd_u(float std_u);

    /**
     * Returns the std_v of this hyde_eddy233.
     *
     * @return the std_v of this hyde_eddy233
     */
    public float getStd_v();

    /**
     * Sets the std_v of this hyde_eddy233.
     *
     * @param std_v the std_v of this hyde_eddy233
     */
    public void setStd_v(float std_v);

    /**
     * Returns the std_w of this hyde_eddy233.
     *
     * @return the std_w of this hyde_eddy233
     */
    public float getStd_w();

    /**
     * Sets the std_w of this hyde_eddy233.
     *
     * @param std_w the std_w of this hyde_eddy233
     */
    public void setStd_w(float std_w);

    /**
     * Returns the av_u of this hyde_eddy233.
     *
     * @return the av_u of this hyde_eddy233
     */
    public float getAv_u();

    /**
     * Sets the av_u of this hyde_eddy233.
     *
     * @param av_u the av_u of this hyde_eddy233
     */
    public void setAv_u(float av_u);

    /**
     * Returns the av_v of this hyde_eddy233.
     *
     * @return the av_v of this hyde_eddy233
     */
    public float getAv_v();

    /**
     * Sets the av_v of this hyde_eddy233.
     *
     * @param av_v the av_v of this hyde_eddy233
     */
    public void setAv_v(float av_v);

    /**
     * Returns the av_w of this hyde_eddy233.
     *
     * @return the av_w of this hyde_eddy233
     */
    public float getAv_w();

    /**
     * Sets the av_w of this hyde_eddy233.
     *
     * @param av_w the av_w of this hyde_eddy233
     */
    public void setAv_w(float av_w);

    /**
     * Returns the av_t of this hyde_eddy233.
     *
     * @return the av_t of this hyde_eddy233
     */
    public float getAv_t();

    /**
     * Sets the av_t of this hyde_eddy233.
     *
     * @param av_t the av_t of this hyde_eddy233
     */
    public void setAv_t(float av_t);

    /**
     * Returns the av_c of this hyde_eddy233.
     *
     * @return the av_c of this hyde_eddy233
     */
    public float getAv_c();

    /**
     * Sets the av_c of this hyde_eddy233.
     *
     * @param av_c the av_c of this hyde_eddy233
     */
    public void setAv_c(float av_c);

    /**
     * Returns the av_h of this hyde_eddy233.
     *
     * @return the av_h of this hyde_eddy233
     */
    public float getAv_h();

    /**
     * Sets the av_h of this hyde_eddy233.
     *
     * @param av_h the av_h of this hyde_eddy233
     */
    public void setAv_h(float av_h);

    /**
     * Returns the u of this hyde_eddy233.
     *
     * @return the u of this hyde_eddy233
     */
    public float getU();

    /**
     * Sets the u of this hyde_eddy233.
     *
     * @param U the u of this hyde_eddy233
     */
    public void setU(float U);

    /**
     * Returns the wind_dir of this hyde_eddy233.
     *
     * @return the wind_dir of this hyde_eddy233
     */
    public float getWind_dir();

    /**
     * Sets the wind_dir of this hyde_eddy233.
     *
     * @param wind_dir the wind_dir of this hyde_eddy233
     */
    public void setWind_dir(float wind_dir);

    /**
     * Returns the eta of this hyde_eddy233.
     *
     * @return the eta of this hyde_eddy233
     */
    public float getEta();

    /**
     * Sets the eta of this hyde_eddy233.
     *
     * @param eta the eta of this hyde_eddy233
     */
    public void setEta(float eta);

    /**
     * Returns the theta of this hyde_eddy233.
     *
     * @return the theta of this hyde_eddy233
     */
    public float getTheta();

    /**
     * Sets the theta of this hyde_eddy233.
     *
     * @param theta the theta of this hyde_eddy233
     */
    public void setTheta(float theta);

    /**
     * Returns the beta of this hyde_eddy233.
     *
     * @return the beta of this hyde_eddy233
     */
    public float getBeta();

    /**
     * Sets the beta of this hyde_eddy233.
     *
     * @param beta the beta of this hyde_eddy233
     */
    public void setBeta(float beta);

    /**
     * Returns the c_lag of this hyde_eddy233.
     *
     * @return the c_lag of this hyde_eddy233
     */
    public int getC_lag();

    /**
     * Sets the c_lag of this hyde_eddy233.
     *
     * @param c_lag the c_lag of this hyde_eddy233
     */
    public void setC_lag(int c_lag);

    /**
     * Returns the h_lag of this hyde_eddy233.
     *
     * @return the h_lag of this hyde_eddy233
     */
    public int getH_lag();

    /**
     * Sets the h_lag of this hyde_eddy233.
     *
     * @param h_lag the h_lag of this hyde_eddy233
     */
    public void setH_lag(int h_lag);

    /**
     * Returns the err_packet of this hyde_eddy233.
     *
     * @return the err_packet of this hyde_eddy233
     */
    public int getErr_packet();

    /**
     * Sets the err_packet of this hyde_eddy233.
     *
     * @param err_packet the err_packet of this hyde_eddy233
     */
    public void setErr_packet(int err_packet);

    /**
     * Returns the licor_t_av of this hyde_eddy233.
     *
     * @return the licor_t_av of this hyde_eddy233
     */
    public float getLicor_t_av();

    /**
     * Sets the licor_t_av of this hyde_eddy233.
     *
     * @param licor_t_av the licor_t_av of this hyde_eddy233
     */
    public void setLicor_t_av(float licor_t_av);

    /**
     * Returns the licor_t_std of this hyde_eddy233.
     *
     * @return the licor_t_std of this hyde_eddy233
     */
    public float getLicor_t_std();

    /**
     * Sets the licor_t_std of this hyde_eddy233.
     *
     * @param licor_t_std the licor_t_std of this hyde_eddy233
     */
    public void setLicor_t_std(float licor_t_std);

    /**
     * Returns the licor_p_av of this hyde_eddy233.
     *
     * @return the licor_p_av of this hyde_eddy233
     */
    public float getLicor_p_av();

    /**
     * Sets the licor_p_av of this hyde_eddy233.
     *
     * @param licor_p_av the licor_p_av of this hyde_eddy233
     */
    public void setLicor_p_av(float licor_p_av);

    /**
     * Returns the licor_p_std of this hyde_eddy233.
     *
     * @return the licor_p_std of this hyde_eddy233
     */
    public float getLicor_p_std();

    /**
     * Sets the licor_p_std of this hyde_eddy233.
     *
     * @param licor_p_std the licor_p_std of this hyde_eddy233
     */
    public void setLicor_p_std(float licor_p_std);

    /**
     * Returns the f_ c p c of this hyde_eddy233.
     *
     * @return the f_ c p c of this hyde_eddy233
     */
    public float getF_CPC();

    /**
     * Sets the f_ c p c of this hyde_eddy233.
     *
     * @param F_CPC the f_ c p c of this hyde_eddy233
     */
    public void setF_CPC(float F_CPC);

    /**
     * Returns the std_ c p c of this hyde_eddy233.
     *
     * @return the std_ c p c of this hyde_eddy233
     */
    public float getStd_CPC();

    /**
     * Sets the std_ c p c of this hyde_eddy233.
     *
     * @param std_CPC the std_ c p c of this hyde_eddy233
     */
    public void setStd_CPC(float std_CPC);

    /**
     * Returns the av_ c p c of this hyde_eddy233.
     *
     * @return the av_ c p c of this hyde_eddy233
     */
    public float getAv_CPC();

    /**
     * Sets the av_ c p c of this hyde_eddy233.
     *
     * @param av_CPC the av_ c p c of this hyde_eddy233
     */
    public void setAv_CPC(float av_CPC);

    /**
     * Returns the c p c_lag of this hyde_eddy233.
     *
     * @return the c p c_lag of this hyde_eddy233
     */
    public int getCPC_lag();

    /**
     * Sets the c p c_lag of this hyde_eddy233.
     *
     * @param CPC_lag the c p c_lag of this hyde_eddy233
     */
    public void setCPC_lag(int CPC_lag);

    /**
     * Returns the std_t of this hyde_eddy233.
     *
     * @return the std_t of this hyde_eddy233
     */
    public float getStd_t();

    /**
     * Sets the std_t of this hyde_eddy233.
     *
     * @param std_t the std_t of this hyde_eddy233
     */
    public void setStd_t(float std_t);

    /**
     * Returns the std_c of this hyde_eddy233.
     *
     * @return the std_c of this hyde_eddy233
     */
    public float getStd_c();

    /**
     * Sets the std_c of this hyde_eddy233.
     *
     * @param std_c the std_c of this hyde_eddy233
     */
    public void setStd_c(float std_c);

    /**
     * Returns the std_h of this hyde_eddy233.
     *
     * @return the std_h of this hyde_eddy233
     */
    public float getStd_h();

    /**
     * Sets the std_h of this hyde_eddy233.
     *
     * @param std_h the std_h of this hyde_eddy233
     */
    public void setStd_h(float std_h);

    /**
     * Returns the quality of this hyde_eddy233.
     *
     * @return the quality of this hyde_eddy233
     */
    public int getQuality();

    /**
     * Sets the quality of this hyde_eddy233.
     *
     * @param quality the quality of this hyde_eddy233
     */
    public void setQuality(int quality);

    /**
     * Returns the qc_ h of this hyde_eddy233.
     *
     * @return the qc_ h of this hyde_eddy233
     */
    public int getQc_H();

    /**
     * Sets the qc_ h of this hyde_eddy233.
     *
     * @param Qc_H the qc_ h of this hyde_eddy233
     */
    public void setQc_H(int Qc_H);

    /**
     * Returns the qc_ l e of this hyde_eddy233.
     *
     * @return the qc_ l e of this hyde_eddy233
     */
    public int getQc_LE();

    /**
     * Sets the qc_ l e of this hyde_eddy233.
     *
     * @param Qc_LE the qc_ l e of this hyde_eddy233
     */
    public void setQc_LE(int Qc_LE);

    /**
     * Returns the qc_ e of this hyde_eddy233.
     *
     * @return the qc_ e of this hyde_eddy233
     */
    public int getQc_E();

    /**
     * Sets the qc_ e of this hyde_eddy233.
     *
     * @param Qc_E the qc_ e of this hyde_eddy233
     */
    public void setQc_E(int Qc_E);

    /**
     * Returns the qc_ f_c of this hyde_eddy233.
     *
     * @return the qc_ f_c of this hyde_eddy233
     */
    public int getQc_F_c();

    /**
     * Sets the qc_ f_c of this hyde_eddy233.
     *
     * @param Qc_F_c the qc_ f_c of this hyde_eddy233
     */
    public void setQc_F_c(int Qc_F_c);

    /**
     * Returns the qc_tau of this hyde_eddy233.
     *
     * @return the qc_tau of this hyde_eddy233
     */
    public int getQc_tau();

    /**
     * Sets the qc_tau of this hyde_eddy233.
     *
     * @param Qc_tau the qc_tau of this hyde_eddy233
     */
    public void setQc_tau(int Qc_tau);

    /**
     * Returns the qc_ f_ c p c of this hyde_eddy233.
     *
     * @return the qc_ f_ c p c of this hyde_eddy233
     */
    public int getQc_F_CPC();

    /**
     * Sets the qc_ f_ c p c of this hyde_eddy233.
     *
     * @param Qc_F_CPC the qc_ f_ c p c of this hyde_eddy233
     */
    public void setQc_F_CPC(int Qc_F_CPC);

    /**
     * Returns the h_ e m e p of this hyde_eddy233.
     *
     * @return the h_ e m e p of this hyde_eddy233
     */
    public int getH_EMEP();

    /**
     * Sets the h_ e m e p of this hyde_eddy233.
     *
     * @param H_EMEP the h_ e m e p of this hyde_eddy233
     */
    public void setH_EMEP(int H_EMEP);

    /**
     * Returns the l e_ e m e p of this hyde_eddy233.
     *
     * @return the l e_ e m e p of this hyde_eddy233
     */
    public int getLE_EMEP();

    /**
     * Sets the l e_ e m e p of this hyde_eddy233.
     *
     * @param LE_EMEP the l e_ e m e p of this hyde_eddy233
     */
    public void setLE_EMEP(int LE_EMEP);

    /**
     * Returns the e_ e m e p of this hyde_eddy233.
     *
     * @return the e_ e m e p of this hyde_eddy233
     */
    public int getE_EMEP();

    /**
     * Sets the e_ e m e p of this hyde_eddy233.
     *
     * @param E_EMEP the e_ e m e p of this hyde_eddy233
     */
    public void setE_EMEP(int E_EMEP);

    /**
     * Returns the f_c_ e m e p of this hyde_eddy233.
     *
     * @return the f_c_ e m e p of this hyde_eddy233
     */
    public int getF_c_EMEP();

    /**
     * Sets the f_c_ e m e p of this hyde_eddy233.
     *
     * @param F_c_EMEP the f_c_ e m e p of this hyde_eddy233
     */
    public void setF_c_EMEP(int F_c_EMEP);

    /**
     * Returns the tau_ e m e p of this hyde_eddy233.
     *
     * @return the tau_ e m e p of this hyde_eddy233
     */
    public int getTau_EMEP();

    /**
     * Sets the tau_ e m e p of this hyde_eddy233.
     *
     * @param tau_EMEP the tau_ e m e p of this hyde_eddy233
     */
    public void setTau_EMEP(int tau_EMEP);

    /**
     * Returns the u_star_ e m e p of this hyde_eddy233.
     *
     * @return the u_star_ e m e p of this hyde_eddy233
     */
    public int getU_star_EMEP();

    /**
     * Sets the u_star_ e m e p of this hyde_eddy233.
     *
     * @param u_star_EMEP the u_star_ e m e p of this hyde_eddy233
     */
    public void setU_star_EMEP(int u_star_EMEP);

    /**
     * Returns the m o_length_ e m e p of this hyde_eddy233.
     *
     * @return the m o_length_ e m e p of this hyde_eddy233
     */
    public int getMO_length_EMEP();

    /**
     * Sets the m o_length_ e m e p of this hyde_eddy233.
     *
     * @param MO_length_EMEP the m o_length_ e m e p of this hyde_eddy233
     */
    public void setMO_length_EMEP(int MO_length_EMEP);

    /**
     * Returns the std_u_ e m e p of this hyde_eddy233.
     *
     * @return the std_u_ e m e p of this hyde_eddy233
     */
    public int getStd_u_EMEP();

    /**
     * Sets the std_u_ e m e p of this hyde_eddy233.
     *
     * @param std_u_EMEP the std_u_ e m e p of this hyde_eddy233
     */
    public void setStd_u_EMEP(int std_u_EMEP);

    /**
     * Returns the std_v_ e m e p of this hyde_eddy233.
     *
     * @return the std_v_ e m e p of this hyde_eddy233
     */
    public int getStd_v_EMEP();

    /**
     * Sets the std_v_ e m e p of this hyde_eddy233.
     *
     * @param std_v_EMEP the std_v_ e m e p of this hyde_eddy233
     */
    public void setStd_v_EMEP(int std_v_EMEP);

    /**
     * Returns the std_w_ e m e p of this hyde_eddy233.
     *
     * @return the std_w_ e m e p of this hyde_eddy233
     */
    public int getStd_w_EMEP();

    /**
     * Sets the std_w_ e m e p of this hyde_eddy233.
     *
     * @param std_w_EMEP the std_w_ e m e p of this hyde_eddy233
     */
    public void setStd_w_EMEP(int std_w_EMEP);

    /**
     * Returns the av_u_ e m e p of this hyde_eddy233.
     *
     * @return the av_u_ e m e p of this hyde_eddy233
     */
    public int getAv_u_EMEP();

    /**
     * Sets the av_u_ e m e p of this hyde_eddy233.
     *
     * @param av_u_EMEP the av_u_ e m e p of this hyde_eddy233
     */
    public void setAv_u_EMEP(int av_u_EMEP);

    /**
     * Returns the av_v_ e m e p of this hyde_eddy233.
     *
     * @return the av_v_ e m e p of this hyde_eddy233
     */
    public int getAv_v_EMEP();

    /**
     * Sets the av_v_ e m e p of this hyde_eddy233.
     *
     * @param av_v_EMEP the av_v_ e m e p of this hyde_eddy233
     */
    public void setAv_v_EMEP(int av_v_EMEP);

    /**
     * Returns the av_w_ e m e p of this hyde_eddy233.
     *
     * @return the av_w_ e m e p of this hyde_eddy233
     */
    public int getAv_w_EMEP();

    /**
     * Sets the av_w_ e m e p of this hyde_eddy233.
     *
     * @param av_w_EMEP the av_w_ e m e p of this hyde_eddy233
     */
    public void setAv_w_EMEP(int av_w_EMEP);

    /**
     * Returns the av_t_ e m e p of this hyde_eddy233.
     *
     * @return the av_t_ e m e p of this hyde_eddy233
     */
    public int getAv_t_EMEP();

    /**
     * Sets the av_t_ e m e p of this hyde_eddy233.
     *
     * @param av_t_EMEP the av_t_ e m e p of this hyde_eddy233
     */
    public void setAv_t_EMEP(int av_t_EMEP);

    /**
     * Returns the av_c_ e m e p of this hyde_eddy233.
     *
     * @return the av_c_ e m e p of this hyde_eddy233
     */
    public int getAv_c_EMEP();

    /**
     * Sets the av_c_ e m e p of this hyde_eddy233.
     *
     * @param av_c_EMEP the av_c_ e m e p of this hyde_eddy233
     */
    public void setAv_c_EMEP(int av_c_EMEP);

    /**
     * Returns the av_h_ e m e p of this hyde_eddy233.
     *
     * @return the av_h_ e m e p of this hyde_eddy233
     */
    public int getAv_h_EMEP();

    /**
     * Sets the av_h_ e m e p of this hyde_eddy233.
     *
     * @param av_h_EMEP the av_h_ e m e p of this hyde_eddy233
     */
    public void setAv_h_EMEP(int av_h_EMEP);

    /**
     * Returns the u_ e m e p of this hyde_eddy233.
     *
     * @return the u_ e m e p of this hyde_eddy233
     */
    public int getU_EMEP();

    /**
     * Sets the u_ e m e p of this hyde_eddy233.
     *
     * @param U_EMEP the u_ e m e p of this hyde_eddy233
     */
    public void setU_EMEP(int U_EMEP);

    /**
     * Returns the wind_dir_ e m e p of this hyde_eddy233.
     *
     * @return the wind_dir_ e m e p of this hyde_eddy233
     */
    public int getWind_dir_EMEP();

    /**
     * Sets the wind_dir_ e m e p of this hyde_eddy233.
     *
     * @param wind_dir_EMEP the wind_dir_ e m e p of this hyde_eddy233
     */
    public void setWind_dir_EMEP(int wind_dir_EMEP);

    /**
     * Returns the eta_ e m e p of this hyde_eddy233.
     *
     * @return the eta_ e m e p of this hyde_eddy233
     */
    public int getEta_EMEP();

    /**
     * Sets the eta_ e m e p of this hyde_eddy233.
     *
     * @param eta_EMEP the eta_ e m e p of this hyde_eddy233
     */
    public void setEta_EMEP(int eta_EMEP);

    /**
     * Returns the theta_ e m e p of this hyde_eddy233.
     *
     * @return the theta_ e m e p of this hyde_eddy233
     */
    public int getTheta_EMEP();

    /**
     * Sets the theta_ e m e p of this hyde_eddy233.
     *
     * @param theta_EMEP the theta_ e m e p of this hyde_eddy233
     */
    public void setTheta_EMEP(int theta_EMEP);

    /**
     * Returns the beta_ e m e p of this hyde_eddy233.
     *
     * @return the beta_ e m e p of this hyde_eddy233
     */
    public int getBeta_EMEP();

    /**
     * Sets the beta_ e m e p of this hyde_eddy233.
     *
     * @param beta_EMEP the beta_ e m e p of this hyde_eddy233
     */
    public void setBeta_EMEP(int beta_EMEP);

    /**
     * Returns the c_lag_ e m e p of this hyde_eddy233.
     *
     * @return the c_lag_ e m e p of this hyde_eddy233
     */
    public int getC_lag_EMEP();

    /**
     * Sets the c_lag_ e m e p of this hyde_eddy233.
     *
     * @param c_lag_EMEP the c_lag_ e m e p of this hyde_eddy233
     */
    public void setC_lag_EMEP(int c_lag_EMEP);

    /**
     * Returns the h_lag_ e m e p of this hyde_eddy233.
     *
     * @return the h_lag_ e m e p of this hyde_eddy233
     */
    public int getH_lag_EMEP();

    /**
     * Sets the h_lag_ e m e p of this hyde_eddy233.
     *
     * @param h_lag_EMEP the h_lag_ e m e p of this hyde_eddy233
     */
    public void setH_lag_EMEP(int h_lag_EMEP);

    /**
     * Returns the err_packet_ e m e p of this hyde_eddy233.
     *
     * @return the err_packet_ e m e p of this hyde_eddy233
     */
    public int getErr_packet_EMEP();

    /**
     * Sets the err_packet_ e m e p of this hyde_eddy233.
     *
     * @param err_packet_EMEP the err_packet_ e m e p of this hyde_eddy233
     */
    public void setErr_packet_EMEP(int err_packet_EMEP);

    /**
     * Returns the licor_t_av_ e m e p of this hyde_eddy233.
     *
     * @return the licor_t_av_ e m e p of this hyde_eddy233
     */
    public int getLicor_t_av_EMEP();

    /**
     * Sets the licor_t_av_ e m e p of this hyde_eddy233.
     *
     * @param licor_t_av_EMEP the licor_t_av_ e m e p of this hyde_eddy233
     */
    public void setLicor_t_av_EMEP(int licor_t_av_EMEP);

    /**
     * Returns the licor_t_std_ e m e p of this hyde_eddy233.
     *
     * @return the licor_t_std_ e m e p of this hyde_eddy233
     */
    public int getLicor_t_std_EMEP();

    /**
     * Sets the licor_t_std_ e m e p of this hyde_eddy233.
     *
     * @param licor_t_std_EMEP the licor_t_std_ e m e p of this hyde_eddy233
     */
    public void setLicor_t_std_EMEP(int licor_t_std_EMEP);

    /**
     * Returns the licor_p_av_ e m e p of this hyde_eddy233.
     *
     * @return the licor_p_av_ e m e p of this hyde_eddy233
     */
    public int getLicor_p_av_EMEP();

    /**
     * Sets the licor_p_av_ e m e p of this hyde_eddy233.
     *
     * @param licor_p_av_EMEP the licor_p_av_ e m e p of this hyde_eddy233
     */
    public void setLicor_p_av_EMEP(int licor_p_av_EMEP);

    /**
     * Returns the licor_p_std_ e m e p of this hyde_eddy233.
     *
     * @return the licor_p_std_ e m e p of this hyde_eddy233
     */
    public int getLicor_p_std_EMEP();

    /**
     * Sets the licor_p_std_ e m e p of this hyde_eddy233.
     *
     * @param licor_p_std_EMEP the licor_p_std_ e m e p of this hyde_eddy233
     */
    public void setLicor_p_std_EMEP(int licor_p_std_EMEP);

    /**
     * Returns the f_ c p c_ e m e p of this hyde_eddy233.
     *
     * @return the f_ c p c_ e m e p of this hyde_eddy233
     */
    public int getF_CPC_EMEP();

    /**
     * Sets the f_ c p c_ e m e p of this hyde_eddy233.
     *
     * @param F_CPC_EMEP the f_ c p c_ e m e p of this hyde_eddy233
     */
    public void setF_CPC_EMEP(int F_CPC_EMEP);

    /**
     * Returns the std_ c p c_ e m e p of this hyde_eddy233.
     *
     * @return the std_ c p c_ e m e p of this hyde_eddy233
     */
    public int getStd_CPC_EMEP();

    /**
     * Sets the std_ c p c_ e m e p of this hyde_eddy233.
     *
     * @param std_CPC_EMEP the std_ c p c_ e m e p of this hyde_eddy233
     */
    public void setStd_CPC_EMEP(int std_CPC_EMEP);

    /**
     * Returns the av_ c p c_ e m e p of this hyde_eddy233.
     *
     * @return the av_ c p c_ e m e p of this hyde_eddy233
     */
    public int getAv_CPC_EMEP();

    /**
     * Sets the av_ c p c_ e m e p of this hyde_eddy233.
     *
     * @param av_CPC_EMEP the av_ c p c_ e m e p of this hyde_eddy233
     */
    public void setAv_CPC_EMEP(int av_CPC_EMEP);

    /**
     * Returns the c p c_lag_ e m e p of this hyde_eddy233.
     *
     * @return the c p c_lag_ e m e p of this hyde_eddy233
     */
    public int getCPC_lag_EMEP();

    /**
     * Sets the c p c_lag_ e m e p of this hyde_eddy233.
     *
     * @param CPC_lag_EMEP the c p c_lag_ e m e p of this hyde_eddy233
     */
    public void setCPC_lag_EMEP(int CPC_lag_EMEP);

    /**
     * Returns the std_t_ e m e p of this hyde_eddy233.
     *
     * @return the std_t_ e m e p of this hyde_eddy233
     */
    public int getStd_t_EMEP();

    /**
     * Sets the std_t_ e m e p of this hyde_eddy233.
     *
     * @param std_t_EMEP the std_t_ e m e p of this hyde_eddy233
     */
    public void setStd_t_EMEP(int std_t_EMEP);

    /**
     * Returns the std_c_ e m e p of this hyde_eddy233.
     *
     * @return the std_c_ e m e p of this hyde_eddy233
     */
    public int getStd_c_EMEP();

    /**
     * Sets the std_c_ e m e p of this hyde_eddy233.
     *
     * @param std_c_EMEP the std_c_ e m e p of this hyde_eddy233
     */
    public void setStd_c_EMEP(int std_c_EMEP);

    /**
     * Returns the std_h_ e m e p of this hyde_eddy233.
     *
     * @return the std_h_ e m e p of this hyde_eddy233
     */
    public int getStd_h_EMEP();

    /**
     * Sets the std_h_ e m e p of this hyde_eddy233.
     *
     * @param std_h_EMEP the std_h_ e m e p of this hyde_eddy233
     */
    public void setStd_h_EMEP(int std_h_EMEP);

    /**
     * Returns the quality_ e m e p of this hyde_eddy233.
     *
     * @return the quality_ e m e p of this hyde_eddy233
     */
    public int getQuality_EMEP();

    /**
     * Sets the quality_ e m e p of this hyde_eddy233.
     *
     * @param quality_EMEP the quality_ e m e p of this hyde_eddy233
     */
    public void setQuality_EMEP(int quality_EMEP);

    /**
     * Returns the qc_ h_ e m e p of this hyde_eddy233.
     *
     * @return the qc_ h_ e m e p of this hyde_eddy233
     */
    public int getQc_H_EMEP();

    /**
     * Sets the qc_ h_ e m e p of this hyde_eddy233.
     *
     * @param Qc_H_EMEP the qc_ h_ e m e p of this hyde_eddy233
     */
    public void setQc_H_EMEP(int Qc_H_EMEP);

    /**
     * Returns the qc_ l e_ e m e p of this hyde_eddy233.
     *
     * @return the qc_ l e_ e m e p of this hyde_eddy233
     */
    public int getQc_LE_EMEP();

    /**
     * Sets the qc_ l e_ e m e p of this hyde_eddy233.
     *
     * @param Qc_LE_EMEP the qc_ l e_ e m e p of this hyde_eddy233
     */
    public void setQc_LE_EMEP(int Qc_LE_EMEP);

    /**
     * Returns the qc_ e_ e m e p of this hyde_eddy233.
     *
     * @return the qc_ e_ e m e p of this hyde_eddy233
     */
    public int getQc_E_EMEP();

    /**
     * Sets the qc_ e_ e m e p of this hyde_eddy233.
     *
     * @param Qc_E_EMEP the qc_ e_ e m e p of this hyde_eddy233
     */
    public void setQc_E_EMEP(int Qc_E_EMEP);

    /**
     * Returns the qc_ f_c_ e m e p of this hyde_eddy233.
     *
     * @return the qc_ f_c_ e m e p of this hyde_eddy233
     */
    public int getQc_F_c_EMEP();

    /**
     * Sets the qc_ f_c_ e m e p of this hyde_eddy233.
     *
     * @param Qc_F_c_EMEP the qc_ f_c_ e m e p of this hyde_eddy233
     */
    public void setQc_F_c_EMEP(int Qc_F_c_EMEP);

    /**
     * Returns the qc_tau_ e m e p of this hyde_eddy233.
     *
     * @return the qc_tau_ e m e p of this hyde_eddy233
     */
    public int getQc_tau_EMEP();

    /**
     * Sets the qc_tau_ e m e p of this hyde_eddy233.
     *
     * @param Qc_tau_EMEP the qc_tau_ e m e p of this hyde_eddy233
     */
    public void setQc_tau_EMEP(int Qc_tau_EMEP);

    /**
     * Returns the qc_ f_ c p c_ e m e p of this hyde_eddy233.
     *
     * @return the qc_ f_ c p c_ e m e p of this hyde_eddy233
     */
    public int getQc_F_CPC_EMEP();

    /**
     * Sets the qc_ f_ c p c_ e m e p of this hyde_eddy233.
     *
     * @param Qc_F_CPC_EMEP the qc_ f_ c p c_ e m e p of this hyde_eddy233
     */
    public void setQc_F_CPC_EMEP(int Qc_F_CPC_EMEP);

    /**
     * Returns the n e e of this hyde_eddy233.
     *
     * @return the n e e of this hyde_eddy233
     */
    public float getNEE();

    /**
     * Sets the n e e of this hyde_eddy233.
     *
     * @param NEE the n e e of this hyde_eddy233
     */
    public void setNEE(float NEE);

    /**
     * Returns the qc_gapf_ n e e of this hyde_eddy233.
     *
     * @return the qc_gapf_ n e e of this hyde_eddy233
     */
    public int getQc_gapf_NEE();

    /**
     * Sets the qc_gapf_ n e e of this hyde_eddy233.
     *
     * @param Qc_gapf_NEE the qc_gapf_ n e e of this hyde_eddy233
     */
    public void setQc_gapf_NEE(int Qc_gapf_NEE);

    /**
     * Returns the g p p of this hyde_eddy233.
     *
     * @return the g p p of this hyde_eddy233
     */
    public float getGPP();

    /**
     * Sets the g p p of this hyde_eddy233.
     *
     * @param GPP the g p p of this hyde_eddy233
     */
    public void setGPP(float GPP);

    /**
     * Returns the t e r of this hyde_eddy233.
     *
     * @return the t e r of this hyde_eddy233
     */
    public float getTER();

    /**
     * Sets the t e r of this hyde_eddy233.
     *
     * @param TER the t e r of this hyde_eddy233
     */
    public void setTER(float TER);

    /**
     * Returns the h_gapf of this hyde_eddy233.
     *
     * @return the h_gapf of this hyde_eddy233
     */
    public float getH_gapf();

    /**
     * Sets the h_gapf of this hyde_eddy233.
     *
     * @param H_gapf the h_gapf of this hyde_eddy233
     */
    public void setH_gapf(float H_gapf);

    /**
     * Returns the qc_gapf_ h of this hyde_eddy233.
     *
     * @return the qc_gapf_ h of this hyde_eddy233
     */
    public int getQc_gapf_H();

    /**
     * Sets the qc_gapf_ h of this hyde_eddy233.
     *
     * @param Qc_gapf_H the qc_gapf_ h of this hyde_eddy233
     */
    public void setQc_gapf_H(int Qc_gapf_H);

    /**
     * Returns the e t_gapf of this hyde_eddy233.
     *
     * @return the e t_gapf of this hyde_eddy233
     */
    public float getET_gapf();

    /**
     * Sets the e t_gapf of this hyde_eddy233.
     *
     * @param ET_gapf the e t_gapf of this hyde_eddy233
     */
    public void setET_gapf(float ET_gapf);

    /**
     * Returns the qc_gapf_ e t of this hyde_eddy233.
     *
     * @return the qc_gapf_ e t of this hyde_eddy233
     */
    public int getQc_gapf_ET();

    /**
     * Sets the qc_gapf_ e t of this hyde_eddy233.
     *
     * @param Qc_gapf_ET the qc_gapf_ e t of this hyde_eddy233
     */
    public void setQc_gapf_ET(int Qc_gapf_ET);

    /**
     * Returns the n e e_ e m e p of this hyde_eddy233.
     *
     * @return the n e e_ e m e p of this hyde_eddy233
     */
    public int getNEE_EMEP();

    /**
     * Sets the n e e_ e m e p of this hyde_eddy233.
     *
     * @param NEE_EMEP the n e e_ e m e p of this hyde_eddy233
     */
    public void setNEE_EMEP(int NEE_EMEP);

    /**
     * Returns the qc_gapf_ n e e_ e m e p of this hyde_eddy233.
     *
     * @return the qc_gapf_ n e e_ e m e p of this hyde_eddy233
     */
    public int getQc_gapf_NEE_EMEP();

    /**
     * Sets the qc_gapf_ n e e_ e m e p of this hyde_eddy233.
     *
     * @param Qc_gapf_NEE_EMEP the qc_gapf_ n e e_ e m e p of this hyde_eddy233
     */
    public void setQc_gapf_NEE_EMEP(int Qc_gapf_NEE_EMEP);

    /**
     * Returns the g p p_ e m e p of this hyde_eddy233.
     *
     * @return the g p p_ e m e p of this hyde_eddy233
     */
    public int getGPP_EMEP();

    /**
     * Sets the g p p_ e m e p of this hyde_eddy233.
     *
     * @param GPP_EMEP the g p p_ e m e p of this hyde_eddy233
     */
    public void setGPP_EMEP(int GPP_EMEP);

    /**
     * Returns the t e r_ e m e p of this hyde_eddy233.
     *
     * @return the t e r_ e m e p of this hyde_eddy233
     */
    public int getTER_EMEP();

    /**
     * Sets the t e r_ e m e p of this hyde_eddy233.
     *
     * @param TER_EMEP the t e r_ e m e p of this hyde_eddy233
     */
    public void setTER_EMEP(int TER_EMEP);

    /**
     * Returns the h_gapf_ e m e p of this hyde_eddy233.
     *
     * @return the h_gapf_ e m e p of this hyde_eddy233
     */
    public int getH_gapf_EMEP();

    /**
     * Sets the h_gapf_ e m e p of this hyde_eddy233.
     *
     * @param H_gapf_EMEP the h_gapf_ e m e p of this hyde_eddy233
     */
    public void setH_gapf_EMEP(int H_gapf_EMEP);

    /**
     * Returns the qc_gapf_ h_ e m e p of this hyde_eddy233.
     *
     * @return the qc_gapf_ h_ e m e p of this hyde_eddy233
     */
    public int getQc_gapf_H_EMEP();

    /**
     * Sets the qc_gapf_ h_ e m e p of this hyde_eddy233.
     *
     * @param Qc_gapf_H_EMEP the qc_gapf_ h_ e m e p of this hyde_eddy233
     */
    public void setQc_gapf_H_EMEP(int Qc_gapf_H_EMEP);

    /**
     * Returns the e t_gapf_ e m e p of this hyde_eddy233.
     *
     * @return the e t_gapf_ e m e p of this hyde_eddy233
     */
    public int getET_gapf_EMEP();

    /**
     * Sets the e t_gapf_ e m e p of this hyde_eddy233.
     *
     * @param ET_gapf_EMEP the e t_gapf_ e m e p of this hyde_eddy233
     */
    public void setET_gapf_EMEP(int ET_gapf_EMEP);

    /**
     * Returns the qc_gapf_ e t_ e m e p of this hyde_eddy233.
     *
     * @return the qc_gapf_ e t_ e m e p of this hyde_eddy233
     */
    public int getQc_gapf_ET_EMEP();

    /**
     * Sets the qc_gapf_ e t_ e m e p of this hyde_eddy233.
     *
     * @param Qc_gapf_ET_EMEP the qc_gapf_ e t_ e m e p of this hyde_eddy233
     */
    public void setQc_gapf_ET_EMEP(int Qc_gapf_ET_EMEP);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(Hyde_eddy233 hyde_eddy233);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Hyde_eddy233> toCacheModel();

    @Override
    public Hyde_eddy233 toEscapedModel();

    @Override
    public Hyde_eddy233 toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
