package fi.csc.smear.db.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Sii2eddy service. Represents a row in the &quot;SII2_EDDY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.smear.db.model.impl.Sii2eddyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.smear.db.model.impl.Sii2eddyImpl}.
 * </p>
 *
 * @author pj
 * @see Sii2eddy
 * @see fi.csc.smear.db.model.impl.Sii2eddyImpl
 * @see fi.csc.smear.db.model.impl.Sii2eddyModelImpl
 * @generated
 */
public interface Sii2eddyModel extends BaseModel<Sii2eddy> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a sii2eddy model instance should use the {@link Sii2eddy} interface instead.
     */

    /**
     * Returns the primary key of this sii2eddy.
     *
     * @return the primary key of this sii2eddy
     */
    public java.util.Date getPrimaryKey();

    /**
     * Sets the primary key of this sii2eddy.
     *
     * @param primaryKey the primary key of this sii2eddy
     */
    public void setPrimaryKey(java.util.Date primaryKey);

    /**
     * Returns the samptime of this sii2eddy.
     *
     * @return the samptime of this sii2eddy
     */
    public Date getSamptime();

    /**
     * Sets the samptime of this sii2eddy.
     *
     * @param samptime the samptime of this sii2eddy
     */
    public void setSamptime(Date samptime);

    /**
     * Returns the u of this sii2eddy.
     *
     * @return the u of this sii2eddy
     */
    public float getU();

    /**
     * Sets the u of this sii2eddy.
     *
     * @param U the u of this sii2eddy
     */
    public void setU(float U);

    /**
     * Returns the u_ e m e p of this sii2eddy.
     *
     * @return the u_ e m e p of this sii2eddy
     */
    public int getU_EMEP();

    /**
     * Sets the u_ e m e p of this sii2eddy.
     *
     * @param U_EMEP the u_ e m e p of this sii2eddy
     */
    public void setU_EMEP(int U_EMEP);

    /**
     * Returns the wind_dir of this sii2eddy.
     *
     * @return the wind_dir of this sii2eddy
     */
    public float getWind_dir();

    /**
     * Sets the wind_dir of this sii2eddy.
     *
     * @param wind_dir the wind_dir of this sii2eddy
     */
    public void setWind_dir(float wind_dir);

    /**
     * Returns the wind_dir_ e m e p of this sii2eddy.
     *
     * @return the wind_dir_ e m e p of this sii2eddy
     */
    public int getWind_dir_EMEP();

    /**
     * Sets the wind_dir_ e m e p of this sii2eddy.
     *
     * @param wind_dir_EMEP the wind_dir_ e m e p of this sii2eddy
     */
    public void setWind_dir_EMEP(int wind_dir_EMEP);

    /**
     * Returns the eta of this sii2eddy.
     *
     * @return the eta of this sii2eddy
     */
    public float getEta();

    /**
     * Sets the eta of this sii2eddy.
     *
     * @param eta the eta of this sii2eddy
     */
    public void setEta(float eta);

    /**
     * Returns the eta_ e m e p of this sii2eddy.
     *
     * @return the eta_ e m e p of this sii2eddy
     */
    public int getEta_EMEP();

    /**
     * Sets the eta_ e m e p of this sii2eddy.
     *
     * @param eta_EMEP the eta_ e m e p of this sii2eddy
     */
    public void setEta_EMEP(int eta_EMEP);

    /**
     * Returns the theta of this sii2eddy.
     *
     * @return the theta of this sii2eddy
     */
    public float getTheta();

    /**
     * Sets the theta of this sii2eddy.
     *
     * @param theta the theta of this sii2eddy
     */
    public void setTheta(float theta);

    /**
     * Returns the theta_ e m e p of this sii2eddy.
     *
     * @return the theta_ e m e p of this sii2eddy
     */
    public int getTheta_EMEP();

    /**
     * Sets the theta_ e m e p of this sii2eddy.
     *
     * @param theta_EMEP the theta_ e m e p of this sii2eddy
     */
    public void setTheta_EMEP(int theta_EMEP);

    /**
     * Returns the beta of this sii2eddy.
     *
     * @return the beta of this sii2eddy
     */
    public float getBeta();

    /**
     * Sets the beta of this sii2eddy.
     *
     * @param beta the beta of this sii2eddy
     */
    public void setBeta(float beta);

    /**
     * Returns the beta_ e m e p of this sii2eddy.
     *
     * @return the beta_ e m e p of this sii2eddy
     */
    public int getBeta_EMEP();

    /**
     * Sets the beta_ e m e p of this sii2eddy.
     *
     * @param beta_EMEP the beta_ e m e p of this sii2eddy
     */
    public void setBeta_EMEP(int beta_EMEP);

    /**
     * Returns the h of this sii2eddy.
     *
     * @return the h of this sii2eddy
     */
    public float getH();

    /**
     * Sets the h of this sii2eddy.
     *
     * @param H the h of this sii2eddy
     */
    public void setH(float H);

    /**
     * Returns the h_ e m e p of this sii2eddy.
     *
     * @return the h_ e m e p of this sii2eddy
     */
    public int getH_EMEP();

    /**
     * Sets the h_ e m e p of this sii2eddy.
     *
     * @param H_EMEP the h_ e m e p of this sii2eddy
     */
    public void setH_EMEP(int H_EMEP);

    /**
     * Returns the tau of this sii2eddy.
     *
     * @return the tau of this sii2eddy
     */
    public float getTau();

    /**
     * Sets the tau of this sii2eddy.
     *
     * @param tau the tau of this sii2eddy
     */
    public void setTau(float tau);

    /**
     * Returns the tau_ e m e p of this sii2eddy.
     *
     * @return the tau_ e m e p of this sii2eddy
     */
    public int getTau_EMEP();

    /**
     * Sets the tau_ e m e p of this sii2eddy.
     *
     * @param tau_EMEP the tau_ e m e p of this sii2eddy
     */
    public void setTau_EMEP(int tau_EMEP);

    /**
     * Returns the u_star of this sii2eddy.
     *
     * @return the u_star of this sii2eddy
     */
    public float getU_star();

    /**
     * Sets the u_star of this sii2eddy.
     *
     * @param u_star the u_star of this sii2eddy
     */
    public void setU_star(float u_star);

    /**
     * Returns the u_star_ e m e p of this sii2eddy.
     *
     * @return the u_star_ e m e p of this sii2eddy
     */
    public int getU_star_EMEP();

    /**
     * Sets the u_star_ e m e p of this sii2eddy.
     *
     * @param u_star_EMEP the u_star_ e m e p of this sii2eddy
     */
    public void setU_star_EMEP(int u_star_EMEP);

    /**
     * Returns the m o_length of this sii2eddy.
     *
     * @return the m o_length of this sii2eddy
     */
    public float getMO_length();

    /**
     * Sets the m o_length of this sii2eddy.
     *
     * @param MO_length the m o_length of this sii2eddy
     */
    public void setMO_length(float MO_length);

    /**
     * Returns the m o_length_ e m e p of this sii2eddy.
     *
     * @return the m o_length_ e m e p of this sii2eddy
     */
    public int getMO_length_EMEP();

    /**
     * Sets the m o_length_ e m e p of this sii2eddy.
     *
     * @param MO_length_EMEP the m o_length_ e m e p of this sii2eddy
     */
    public void setMO_length_EMEP(int MO_length_EMEP);

    /**
     * Returns the err_packet of this sii2eddy.
     *
     * @return the err_packet of this sii2eddy
     */
    public float getErr_packet();

    /**
     * Sets the err_packet of this sii2eddy.
     *
     * @param err_packet the err_packet of this sii2eddy
     */
    public void setErr_packet(float err_packet);

    /**
     * Returns the err_packet_ e m e p of this sii2eddy.
     *
     * @return the err_packet_ e m e p of this sii2eddy
     */
    public int getErr_packet_EMEP();

    /**
     * Sets the err_packet_ e m e p of this sii2eddy.
     *
     * @param err_packet_EMEP the err_packet_ e m e p of this sii2eddy
     */
    public void setErr_packet_EMEP(int err_packet_EMEP);

    /**
     * Returns the f_c_ l i72 of this sii2eddy.
     *
     * @return the f_c_ l i72 of this sii2eddy
     */
    public float getF_c_LI72();

    /**
     * Sets the f_c_ l i72 of this sii2eddy.
     *
     * @param F_c_LI72 the f_c_ l i72 of this sii2eddy
     */
    public void setF_c_LI72(float F_c_LI72);

    /**
     * Returns the f_c_ l i72_ e m e p of this sii2eddy.
     *
     * @return the f_c_ l i72_ e m e p of this sii2eddy
     */
    public int getF_c_LI72_EMEP();

    /**
     * Sets the f_c_ l i72_ e m e p of this sii2eddy.
     *
     * @param F_c_LI72_EMEP the f_c_ l i72_ e m e p of this sii2eddy
     */
    public void setF_c_LI72_EMEP(int F_c_LI72_EMEP);

    /**
     * Returns the f_ h2 o_ l i72 of this sii2eddy.
     *
     * @return the f_ h2 o_ l i72 of this sii2eddy
     */
    public float getF_H2O_LI72();

    /**
     * Sets the f_ h2 o_ l i72 of this sii2eddy.
     *
     * @param F_H2O_LI72 the f_ h2 o_ l i72 of this sii2eddy
     */
    public void setF_H2O_LI72(float F_H2O_LI72);

    /**
     * Returns the f_ h2 o_ l i72_ e m e p of this sii2eddy.
     *
     * @return the f_ h2 o_ l i72_ e m e p of this sii2eddy
     */
    public int getF_H2O_LI72_EMEP();

    /**
     * Sets the f_ h2 o_ l i72_ e m e p of this sii2eddy.
     *
     * @param F_H2O_LI72_EMEP the f_ h2 o_ l i72_ e m e p of this sii2eddy
     */
    public void setF_H2O_LI72_EMEP(int F_H2O_LI72_EMEP);

    /**
     * Returns the f_ c h4_ l i77 of this sii2eddy.
     *
     * @return the f_ c h4_ l i77 of this sii2eddy
     */
    public float getF_CH4_LI77();

    /**
     * Sets the f_ c h4_ l i77 of this sii2eddy.
     *
     * @param F_CH4_LI77 the f_ c h4_ l i77 of this sii2eddy
     */
    public void setF_CH4_LI77(float F_CH4_LI77);

    /**
     * Returns the f_ c h4_ l i77_ e m e p of this sii2eddy.
     *
     * @return the f_ c h4_ l i77_ e m e p of this sii2eddy
     */
    public int getF_CH4_LI77_EMEP();

    /**
     * Sets the f_ c h4_ l i77_ e m e p of this sii2eddy.
     *
     * @param F_CH4_LI77_EMEP the f_ c h4_ l i77_ e m e p of this sii2eddy
     */
    public void setF_CH4_LI77_EMEP(int F_CH4_LI77_EMEP);

    /**
     * Returns the l e_ l i72 of this sii2eddy.
     *
     * @return the l e_ l i72 of this sii2eddy
     */
    public float getLE_LI72();

    /**
     * Sets the l e_ l i72 of this sii2eddy.
     *
     * @param LE_LI72 the l e_ l i72 of this sii2eddy
     */
    public void setLE_LI72(float LE_LI72);

    /**
     * Returns the l e_ l i72_ e m e p of this sii2eddy.
     *
     * @return the l e_ l i72_ e m e p of this sii2eddy
     */
    public int getLE_LI72_EMEP();

    /**
     * Sets the l e_ l i72_ e m e p of this sii2eddy.
     *
     * @param LE_LI72_EMEP the l e_ l i72_ e m e p of this sii2eddy
     */
    public void setLE_LI72_EMEP(int LE_LI72_EMEP);

    /**
     * Returns the av_u of this sii2eddy.
     *
     * @return the av_u of this sii2eddy
     */
    public float getAv_u();

    /**
     * Sets the av_u of this sii2eddy.
     *
     * @param av_u the av_u of this sii2eddy
     */
    public void setAv_u(float av_u);

    /**
     * Returns the av_u_ e m e p of this sii2eddy.
     *
     * @return the av_u_ e m e p of this sii2eddy
     */
    public int getAv_u_EMEP();

    /**
     * Sets the av_u_ e m e p of this sii2eddy.
     *
     * @param av_u_EMEP the av_u_ e m e p of this sii2eddy
     */
    public void setAv_u_EMEP(int av_u_EMEP);

    /**
     * Returns the av_v of this sii2eddy.
     *
     * @return the av_v of this sii2eddy
     */
    public float getAv_v();

    /**
     * Sets the av_v of this sii2eddy.
     *
     * @param av_v the av_v of this sii2eddy
     */
    public void setAv_v(float av_v);

    /**
     * Returns the av_v_ e m e p of this sii2eddy.
     *
     * @return the av_v_ e m e p of this sii2eddy
     */
    public int getAv_v_EMEP();

    /**
     * Sets the av_v_ e m e p of this sii2eddy.
     *
     * @param av_v_EMEP the av_v_ e m e p of this sii2eddy
     */
    public void setAv_v_EMEP(int av_v_EMEP);

    /**
     * Returns the av_w of this sii2eddy.
     *
     * @return the av_w of this sii2eddy
     */
    public float getAv_w();

    /**
     * Sets the av_w of this sii2eddy.
     *
     * @param av_w the av_w of this sii2eddy
     */
    public void setAv_w(float av_w);

    /**
     * Returns the av_w_ e m e p of this sii2eddy.
     *
     * @return the av_w_ e m e p of this sii2eddy
     */
    public int getAv_w_EMEP();

    /**
     * Sets the av_w_ e m e p of this sii2eddy.
     *
     * @param av_w_EMEP the av_w_ e m e p of this sii2eddy
     */
    public void setAv_w_EMEP(int av_w_EMEP);

    /**
     * Returns the t_s of this sii2eddy.
     *
     * @return the t_s of this sii2eddy
     */
    public float getT_s();

    /**
     * Sets the t_s of this sii2eddy.
     *
     * @param T_s the t_s of this sii2eddy
     */
    public void setT_s(float T_s);

    /**
     * Returns the t_s_ e m e p of this sii2eddy.
     *
     * @return the t_s_ e m e p of this sii2eddy
     */
    public int getT_s_EMEP();

    /**
     * Sets the t_s_ e m e p of this sii2eddy.
     *
     * @param T_s_EMEP the t_s_ e m e p of this sii2eddy
     */
    public void setT_s_EMEP(int T_s_EMEP);

    /**
     * Returns the av_c of this sii2eddy.
     *
     * @return the av_c of this sii2eddy
     */
    public float getAv_c();

    /**
     * Sets the av_c of this sii2eddy.
     *
     * @param av_c the av_c of this sii2eddy
     */
    public void setAv_c(float av_c);

    /**
     * Returns the av_c_ e m e p of this sii2eddy.
     *
     * @return the av_c_ e m e p of this sii2eddy
     */
    public int getAv_c_EMEP();

    /**
     * Sets the av_c_ e m e p of this sii2eddy.
     *
     * @param av_c_EMEP the av_c_ e m e p of this sii2eddy
     */
    public void setAv_c_EMEP(int av_c_EMEP);

    /**
     * Returns the av_ h2 o_ l i72 of this sii2eddy.
     *
     * @return the av_ h2 o_ l i72 of this sii2eddy
     */
    public float getAv_H2O_LI72();

    /**
     * Sets the av_ h2 o_ l i72 of this sii2eddy.
     *
     * @param av_H2O_LI72 the av_ h2 o_ l i72 of this sii2eddy
     */
    public void setAv_H2O_LI72(float av_H2O_LI72);

    /**
     * Returns the av_ h2 o_ l i72_ e m e p of this sii2eddy.
     *
     * @return the av_ h2 o_ l i72_ e m e p of this sii2eddy
     */
    public int getAv_H2O_LI72_EMEP();

    /**
     * Sets the av_ h2 o_ l i72_ e m e p of this sii2eddy.
     *
     * @param av_H2O_LI72_EMEP the av_ h2 o_ l i72_ e m e p of this sii2eddy
     */
    public void setAv_H2O_LI72_EMEP(int av_H2O_LI72_EMEP);

    /**
     * Returns the av_ c h4_ l i77 of this sii2eddy.
     *
     * @return the av_ c h4_ l i77 of this sii2eddy
     */
    public float getAv_CH4_LI77();

    /**
     * Sets the av_ c h4_ l i77 of this sii2eddy.
     *
     * @param av_CH4_LI77 the av_ c h4_ l i77 of this sii2eddy
     */
    public void setAv_CH4_LI77(float av_CH4_LI77);

    /**
     * Returns the av_ c h4_ l i77_ e m e p of this sii2eddy.
     *
     * @return the av_ c h4_ l i77_ e m e p of this sii2eddy
     */
    public int getAv_CH4_LI77_EMEP();

    /**
     * Sets the av_ c h4_ l i77_ e m e p of this sii2eddy.
     *
     * @param av_CH4_LI77_EMEP the av_ c h4_ l i77_ e m e p of this sii2eddy
     */
    public void setAv_CH4_LI77_EMEP(int av_CH4_LI77_EMEP);

    /**
     * Returns the std_u of this sii2eddy.
     *
     * @return the std_u of this sii2eddy
     */
    public float getStd_u();

    /**
     * Sets the std_u of this sii2eddy.
     *
     * @param std_u the std_u of this sii2eddy
     */
    public void setStd_u(float std_u);

    /**
     * Returns the std_u_ e m e p of this sii2eddy.
     *
     * @return the std_u_ e m e p of this sii2eddy
     */
    public int getStd_u_EMEP();

    /**
     * Sets the std_u_ e m e p of this sii2eddy.
     *
     * @param std_u_EMEP the std_u_ e m e p of this sii2eddy
     */
    public void setStd_u_EMEP(int std_u_EMEP);

    /**
     * Returns the std_v of this sii2eddy.
     *
     * @return the std_v of this sii2eddy
     */
    public float getStd_v();

    /**
     * Sets the std_v of this sii2eddy.
     *
     * @param std_v the std_v of this sii2eddy
     */
    public void setStd_v(float std_v);

    /**
     * Returns the std_v_ e m e p of this sii2eddy.
     *
     * @return the std_v_ e m e p of this sii2eddy
     */
    public int getStd_v_EMEP();

    /**
     * Sets the std_v_ e m e p of this sii2eddy.
     *
     * @param std_v_EMEP the std_v_ e m e p of this sii2eddy
     */
    public void setStd_v_EMEP(int std_v_EMEP);

    /**
     * Returns the std_w of this sii2eddy.
     *
     * @return the std_w of this sii2eddy
     */
    public float getStd_w();

    /**
     * Sets the std_w of this sii2eddy.
     *
     * @param std_w the std_w of this sii2eddy
     */
    public void setStd_w(float std_w);

    /**
     * Returns the std_w_ e m e p of this sii2eddy.
     *
     * @return the std_w_ e m e p of this sii2eddy
     */
    public int getStd_w_EMEP();

    /**
     * Sets the std_w_ e m e p of this sii2eddy.
     *
     * @param std_w_EMEP the std_w_ e m e p of this sii2eddy
     */
    public void setStd_w_EMEP(int std_w_EMEP);

    /**
     * Returns the std_ t_s of this sii2eddy.
     *
     * @return the std_ t_s of this sii2eddy
     */
    public float getStd_T_s();

    /**
     * Sets the std_ t_s of this sii2eddy.
     *
     * @param std_T_s the std_ t_s of this sii2eddy
     */
    public void setStd_T_s(float std_T_s);

    /**
     * Returns the std_ t_s_ e m e p of this sii2eddy.
     *
     * @return the std_ t_s_ e m e p of this sii2eddy
     */
    public int getStd_T_s_EMEP();

    /**
     * Sets the std_ t_s_ e m e p of this sii2eddy.
     *
     * @param std_T_s_EMEP the std_ t_s_ e m e p of this sii2eddy
     */
    public void setStd_T_s_EMEP(int std_T_s_EMEP);

    /**
     * Returns the std_c_ l i72 of this sii2eddy.
     *
     * @return the std_c_ l i72 of this sii2eddy
     */
    public float getStd_c_LI72();

    /**
     * Sets the std_c_ l i72 of this sii2eddy.
     *
     * @param std_c_LI72 the std_c_ l i72 of this sii2eddy
     */
    public void setStd_c_LI72(float std_c_LI72);

    /**
     * Returns the std_c_ l i72_ e m e p of this sii2eddy.
     *
     * @return the std_c_ l i72_ e m e p of this sii2eddy
     */
    public int getStd_c_LI72_EMEP();

    /**
     * Sets the std_c_ l i72_ e m e p of this sii2eddy.
     *
     * @param std_c_LI72_EMEP the std_c_ l i72_ e m e p of this sii2eddy
     */
    public void setStd_c_LI72_EMEP(int std_c_LI72_EMEP);

    /**
     * Returns the std_ h2 o_ l i72 of this sii2eddy.
     *
     * @return the std_ h2 o_ l i72 of this sii2eddy
     */
    public float getStd_H2O_LI72();

    /**
     * Sets the std_ h2 o_ l i72 of this sii2eddy.
     *
     * @param std_H2O_LI72 the std_ h2 o_ l i72 of this sii2eddy
     */
    public void setStd_H2O_LI72(float std_H2O_LI72);

    /**
     * Returns the std_ h2 o_ l i72_ e m e p of this sii2eddy.
     *
     * @return the std_ h2 o_ l i72_ e m e p of this sii2eddy
     */
    public int getStd_H2O_LI72_EMEP();

    /**
     * Sets the std_ h2 o_ l i72_ e m e p of this sii2eddy.
     *
     * @param std_H2O_LI72_EMEP the std_ h2 o_ l i72_ e m e p of this sii2eddy
     */
    public void setStd_H2O_LI72_EMEP(int std_H2O_LI72_EMEP);

    /**
     * Returns the std_ c h4_ l i77 of this sii2eddy.
     *
     * @return the std_ c h4_ l i77 of this sii2eddy
     */
    public float getStd_CH4_LI77();

    /**
     * Sets the std_ c h4_ l i77 of this sii2eddy.
     *
     * @param std_CH4_LI77 the std_ c h4_ l i77 of this sii2eddy
     */
    public void setStd_CH4_LI77(float std_CH4_LI77);

    /**
     * Returns the std_ c h4_ l i77_ e m e p of this sii2eddy.
     *
     * @return the std_ c h4_ l i77_ e m e p of this sii2eddy
     */
    public int getStd_CH4_LI77_EMEP();

    /**
     * Sets the std_ c h4_ l i77_ e m e p of this sii2eddy.
     *
     * @param std_CH4_LI77_EMEP the std_ c h4_ l i77_ e m e p of this sii2eddy
     */
    public void setStd_CH4_LI77_EMEP(int std_CH4_LI77_EMEP);

    /**
     * Returns the c_lag_ l i72 of this sii2eddy.
     *
     * @return the c_lag_ l i72 of this sii2eddy
     */
    public float getC_lag_LI72();

    /**
     * Sets the c_lag_ l i72 of this sii2eddy.
     *
     * @param c_lag_LI72 the c_lag_ l i72 of this sii2eddy
     */
    public void setC_lag_LI72(float c_lag_LI72);

    /**
     * Returns the c_lag_ l i72_ e m e p of this sii2eddy.
     *
     * @return the c_lag_ l i72_ e m e p of this sii2eddy
     */
    public int getC_lag_LI72_EMEP();

    /**
     * Sets the c_lag_ l i72_ e m e p of this sii2eddy.
     *
     * @param c_lag_LI72_EMEP the c_lag_ l i72_ e m e p of this sii2eddy
     */
    public void setC_lag_LI72_EMEP(int c_lag_LI72_EMEP);

    /**
     * Returns the h2 o_lag_ l i72 of this sii2eddy.
     *
     * @return the h2 o_lag_ l i72 of this sii2eddy
     */
    public float getH2O_lag_LI72();

    /**
     * Sets the h2 o_lag_ l i72 of this sii2eddy.
     *
     * @param H2O_lag_LI72 the h2 o_lag_ l i72 of this sii2eddy
     */
    public void setH2O_lag_LI72(float H2O_lag_LI72);

    /**
     * Returns the h2 o_lag_ l i72_ e m e p of this sii2eddy.
     *
     * @return the h2 o_lag_ l i72_ e m e p of this sii2eddy
     */
    public int getH2O_lag_LI72_EMEP();

    /**
     * Sets the h2 o_lag_ l i72_ e m e p of this sii2eddy.
     *
     * @param H2O_lag_LI72_EMEP the h2 o_lag_ l i72_ e m e p of this sii2eddy
     */
    public void setH2O_lag_LI72_EMEP(int H2O_lag_LI72_EMEP);

    /**
     * Returns the c h4_lag_ l i77 of this sii2eddy.
     *
     * @return the c h4_lag_ l i77 of this sii2eddy
     */
    public float getCH4_lag_LI77();

    /**
     * Sets the c h4_lag_ l i77 of this sii2eddy.
     *
     * @param CH4_lag_LI77 the c h4_lag_ l i77 of this sii2eddy
     */
    public void setCH4_lag_LI77(float CH4_lag_LI77);

    /**
     * Returns the c h4_lag_ l i77_ e m e p of this sii2eddy.
     *
     * @return the c h4_lag_ l i77_ e m e p of this sii2eddy
     */
    public int getCH4_lag_LI77_EMEP();

    /**
     * Sets the c h4_lag_ l i77_ e m e p of this sii2eddy.
     *
     * @param CH4_lag_LI77_EMEP the c h4_lag_ l i77_ e m e p of this sii2eddy
     */
    public void setCH4_lag_LI77_EMEP(int CH4_lag_LI77_EMEP);

    /**
     * Returns the qc_ h of this sii2eddy.
     *
     * @return the qc_ h of this sii2eddy
     */
    public int getQc_H();

    /**
     * Sets the qc_ h of this sii2eddy.
     *
     * @param Qc_H the qc_ h of this sii2eddy
     */
    public void setQc_H(int Qc_H);

    /**
     * Returns the qc_ h_ e m e p of this sii2eddy.
     *
     * @return the qc_ h_ e m e p of this sii2eddy
     */
    public int getQc_H_EMEP();

    /**
     * Sets the qc_ h_ e m e p of this sii2eddy.
     *
     * @param Qc_H_EMEP the qc_ h_ e m e p of this sii2eddy
     */
    public void setQc_H_EMEP(int Qc_H_EMEP);

    /**
     * Returns the qc_ c o2_ l i70 of this sii2eddy.
     *
     * @return the qc_ c o2_ l i70 of this sii2eddy
     */
    public int getQc_CO2_LI70();

    /**
     * Sets the qc_ c o2_ l i70 of this sii2eddy.
     *
     * @param Qc_CO2_LI70 the qc_ c o2_ l i70 of this sii2eddy
     */
    public void setQc_CO2_LI70(int Qc_CO2_LI70);

    /**
     * Returns the qc_ c o2_ l i70_ e m e p of this sii2eddy.
     *
     * @return the qc_ c o2_ l i70_ e m e p of this sii2eddy
     */
    public int getQc_CO2_LI70_EMEP();

    /**
     * Sets the qc_ c o2_ l i70_ e m e p of this sii2eddy.
     *
     * @param Qc_CO2_LI70_EMEP the qc_ c o2_ l i70_ e m e p of this sii2eddy
     */
    public void setQc_CO2_LI70_EMEP(int Qc_CO2_LI70_EMEP);

    /**
     * Returns the qc_ c h4_ l i77 of this sii2eddy.
     *
     * @return the qc_ c h4_ l i77 of this sii2eddy
     */
    public int getQc_CH4_LI77();

    /**
     * Sets the qc_ c h4_ l i77 of this sii2eddy.
     *
     * @param Qc_CH4_LI77 the qc_ c h4_ l i77 of this sii2eddy
     */
    public void setQc_CH4_LI77(int Qc_CH4_LI77);

    /**
     * Returns the qc_ c h4_ l i77_ e m e p of this sii2eddy.
     *
     * @return the qc_ c h4_ l i77_ e m e p of this sii2eddy
     */
    public int getQc_CH4_LI77_EMEP();

    /**
     * Sets the qc_ c h4_ l i77_ e m e p of this sii2eddy.
     *
     * @param Qc_CH4_LI77_EMEP the qc_ c h4_ l i77_ e m e p of this sii2eddy
     */
    public void setQc_CH4_LI77_EMEP(int Qc_CH4_LI77_EMEP);

    /**
     * Returns the qc_ l e_ l i72 of this sii2eddy.
     *
     * @return the qc_ l e_ l i72 of this sii2eddy
     */
    public int getQc_LE_LI72();

    /**
     * Sets the qc_ l e_ l i72 of this sii2eddy.
     *
     * @param Qc_LE_LI72 the qc_ l e_ l i72 of this sii2eddy
     */
    public void setQc_LE_LI72(int Qc_LE_LI72);

    /**
     * Returns the qc_ l e_ l i72_ e m e p of this sii2eddy.
     *
     * @return the qc_ l e_ l i72_ e m e p of this sii2eddy
     */
    public int getQc_LE_LI72_EMEP();

    /**
     * Sets the qc_ l e_ l i72_ e m e p of this sii2eddy.
     *
     * @param Qc_LE_LI72_EMEP the qc_ l e_ l i72_ e m e p of this sii2eddy
     */
    public void setQc_LE_LI72_EMEP(int Qc_LE_LI72_EMEP);

    /**
     * Returns the qc_tau of this sii2eddy.
     *
     * @return the qc_tau of this sii2eddy
     */
    public int getQc_tau();

    /**
     * Sets the qc_tau of this sii2eddy.
     *
     * @param Qc_tau the qc_tau of this sii2eddy
     */
    public void setQc_tau(int Qc_tau);

    /**
     * Returns the qc_tau_ e m e p of this sii2eddy.
     *
     * @return the qc_tau_ e m e p of this sii2eddy
     */
    public int getQc_tau_EMEP();

    /**
     * Sets the qc_tau_ e m e p of this sii2eddy.
     *
     * @param Qc_tau_EMEP the qc_tau_ e m e p of this sii2eddy
     */
    public void setQc_tau_EMEP(int Qc_tau_EMEP);

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
    public int compareTo(Sii2eddy sii2eddy);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Sii2eddy> toCacheModel();

    @Override
    public Sii2eddy toEscapedModel();

    @Override
    public Sii2eddy toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}