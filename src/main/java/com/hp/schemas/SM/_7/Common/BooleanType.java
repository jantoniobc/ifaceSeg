/**
 * BooleanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7.Common;

public class BooleanType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private boolean _value;

    private java.lang.String type;  // attribute

    private java.lang.Boolean mandatory;  // attribute

    private java.lang.Boolean readonly;  // attribute

    public BooleanType() {
    }

    // Simple Types must have a String constructor
    public BooleanType(boolean _value) {
        this._value = _value;
    }
    public BooleanType(java.lang.String _value) {
        this._value = new Boolean(_value).booleanValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Boolean(_value).toString();
    }


    /**
     * Gets the _value value for this BooleanType.
     * 
     * @return _value
     */
    public boolean is_value() {
        return _value;
    }


    /**
     * Sets the _value value for this BooleanType.
     * 
     * @param _value
     */
    public void set_value(boolean _value) {
        this._value = _value;
    }


    /**
     * Gets the type value for this BooleanType.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this BooleanType.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the mandatory value for this BooleanType.
     * 
     * @return mandatory
     */
    public java.lang.Boolean getMandatory() {
        return mandatory;
    }


    /**
     * Sets the mandatory value for this BooleanType.
     * 
     * @param mandatory
     */
    public void setMandatory(java.lang.Boolean mandatory) {
        this.mandatory = mandatory;
    }


    /**
     * Gets the readonly value for this BooleanType.
     * 
     * @return readonly
     */
    public java.lang.Boolean getReadonly() {
        return readonly;
    }


    /**
     * Sets the readonly value for this BooleanType.
     * 
     * @param readonly
     */
    public void setReadonly(java.lang.Boolean readonly) {
        this.readonly = readonly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BooleanType)) return false;
        BooleanType other = (BooleanType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.is_value() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.mandatory==null && other.getMandatory()==null) || 
             (this.mandatory!=null &&
              this.mandatory.equals(other.getMandatory()))) &&
            ((this.readonly==null && other.getReadonly()==null) || 
             (this.readonly!=null &&
              this.readonly.equals(other.getReadonly())));
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
        _hashCode += (is_value() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getMandatory() != null) {
            _hashCode += getMandatory().hashCode();
        }
        if (getReadonly() != null) {
            _hashCode += getReadonly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BooleanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "BooleanType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mandatory");
        attrField.setXmlName(new javax.xml.namespace.QName("", "mandatory"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("readonly");
        attrField.setXmlName(new javax.xml.namespace.QName("", "readonly"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
