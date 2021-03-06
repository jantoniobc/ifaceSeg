/**
 * CreateIncidenteSP_SEGRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class CreateIncidenteSP_SEGRequest  implements java.io.Serializable {
    private com.hp.schemas.SM._7.IncidenteSP_SEGModelType model;

    private java.lang.Boolean attachmentInfo;  // attribute

    private java.lang.Boolean attachmentData;  // attribute

    private java.lang.Boolean ignoreEmptyElements;  // attribute

    private java.lang.Long updateconstraint;  // attribute

    public CreateIncidenteSP_SEGRequest() {
    }

    public CreateIncidenteSP_SEGRequest(
           com.hp.schemas.SM._7.IncidenteSP_SEGModelType model,
           java.lang.Boolean attachmentInfo,
           java.lang.Boolean attachmentData,
           java.lang.Boolean ignoreEmptyElements,
           java.lang.Long updateconstraint) {
           this.model = model;
           this.attachmentInfo = attachmentInfo;
           this.attachmentData = attachmentData;
           this.ignoreEmptyElements = ignoreEmptyElements;
           this.updateconstraint = updateconstraint;
    }


    /**
     * Gets the model value for this CreateIncidenteSP_SEGRequest.
     * 
     * @return model
     */
    public com.hp.schemas.SM._7.IncidenteSP_SEGModelType getModel() {
        return model;
    }


    /**
     * Sets the model value for this CreateIncidenteSP_SEGRequest.
     * 
     * @param model
     */
    public void setModel(com.hp.schemas.SM._7.IncidenteSP_SEGModelType model) {
        this.model = model;
    }


    /**
     * Gets the attachmentInfo value for this CreateIncidenteSP_SEGRequest.
     * 
     * @return attachmentInfo
     */
    public java.lang.Boolean getAttachmentInfo() {
        return attachmentInfo;
    }


    /**
     * Sets the attachmentInfo value for this CreateIncidenteSP_SEGRequest.
     * 
     * @param attachmentInfo
     */
    public void setAttachmentInfo(java.lang.Boolean attachmentInfo) {
        this.attachmentInfo = attachmentInfo;
    }


    /**
     * Gets the attachmentData value for this CreateIncidenteSP_SEGRequest.
     * 
     * @return attachmentData
     */
    public java.lang.Boolean getAttachmentData() {
        return attachmentData;
    }


    /**
     * Sets the attachmentData value for this CreateIncidenteSP_SEGRequest.
     * 
     * @param attachmentData
     */
    public void setAttachmentData(java.lang.Boolean attachmentData) {
        this.attachmentData = attachmentData;
    }


    /**
     * Gets the ignoreEmptyElements value for this CreateIncidenteSP_SEGRequest.
     * 
     * @return ignoreEmptyElements
     */
    public java.lang.Boolean getIgnoreEmptyElements() {
        return ignoreEmptyElements;
    }


    /**
     * Sets the ignoreEmptyElements value for this CreateIncidenteSP_SEGRequest.
     * 
     * @param ignoreEmptyElements
     */
    public void setIgnoreEmptyElements(java.lang.Boolean ignoreEmptyElements) {
        this.ignoreEmptyElements = ignoreEmptyElements;
    }


    /**
     * Gets the updateconstraint value for this CreateIncidenteSP_SEGRequest.
     * 
     * @return updateconstraint
     */
    public java.lang.Long getUpdateconstraint() {
        return updateconstraint;
    }


    /**
     * Sets the updateconstraint value for this CreateIncidenteSP_SEGRequest.
     * 
     * @param updateconstraint
     */
    public void setUpdateconstraint(java.lang.Long updateconstraint) {
        this.updateconstraint = updateconstraint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateIncidenteSP_SEGRequest)) return false;
        CreateIncidenteSP_SEGRequest other = (CreateIncidenteSP_SEGRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.attachmentInfo==null && other.getAttachmentInfo()==null) || 
             (this.attachmentInfo!=null &&
              this.attachmentInfo.equals(other.getAttachmentInfo()))) &&
            ((this.attachmentData==null && other.getAttachmentData()==null) || 
             (this.attachmentData!=null &&
              this.attachmentData.equals(other.getAttachmentData()))) &&
            ((this.ignoreEmptyElements==null && other.getIgnoreEmptyElements()==null) || 
             (this.ignoreEmptyElements!=null &&
              this.ignoreEmptyElements.equals(other.getIgnoreEmptyElements()))) &&
            ((this.updateconstraint==null && other.getUpdateconstraint()==null) || 
             (this.updateconstraint!=null &&
              this.updateconstraint.equals(other.getUpdateconstraint())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getAttachmentInfo() != null) {
            _hashCode += getAttachmentInfo().hashCode();
        }
        if (getAttachmentData() != null) {
            _hashCode += getAttachmentData().hashCode();
        }
        if (getIgnoreEmptyElements() != null) {
            _hashCode += getIgnoreEmptyElements().hashCode();
        }
        if (getUpdateconstraint() != null) {
            _hashCode += getUpdateconstraint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateIncidenteSP_SEGRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">CreateIncidenteSP_SEGRequest"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attachmentInfo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "attachmentInfo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attachmentData");
        attrField.setXmlName(new javax.xml.namespace.QName("", "attachmentData"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ignoreEmptyElements");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ignoreEmptyElements"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("updateconstraint");
        attrField.setXmlName(new javax.xml.namespace.QName("", "updateconstraint"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IncidenteSP_SEGModelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
