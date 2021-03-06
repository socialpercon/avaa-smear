package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.Hydemeta;
import fi.csc.smear.db.service.HydemetaLocalServiceUtil;

/**
 * The extended model base implementation for the Hydemeta service. Represents a row in the &quot;HYY_META&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HydemetaImpl}.
 * </p>
 *
 * @author pj
 * @see HydemetaImpl
 * @see fi.csc.smear.db.model.Hydemeta
 * @generated
 */
public abstract class HydemetaBaseImpl extends HydemetaModelImpl
    implements Hydemeta {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a hydemeta model instance should use the {@link Hydemeta} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            HydemetaLocalServiceUtil.addHydemeta(this);
        } else {
            HydemetaLocalServiceUtil.updateHydemeta(this);
        }
    }
}
