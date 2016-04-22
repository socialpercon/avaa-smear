package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.SmearvariableTags;
import fi.csc.smear.db.service.SmearvariableTagsLocalServiceUtil;

/**
 * The extended model base implementation for the SmearvariableTags service. Represents a row in the &quot;variableTags&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SmearvariableTagsImpl}.
 * </p>
 *
 * @author pj
 * @see SmearvariableTagsImpl
 * @see fi.csc.smear.db.model.SmearvariableTags
 * @generated
 */
public abstract class SmearvariableTagsBaseImpl
    extends SmearvariableTagsModelImpl implements SmearvariableTags {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a smearvariable tags model instance should use the {@link SmearvariableTags} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SmearvariableTagsLocalServiceUtil.addSmearvariableTags(this);
        } else {
            SmearvariableTagsLocalServiceUtil.updateSmearvariableTags(this);
        }
    }
}