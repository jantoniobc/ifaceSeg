/**
 * RetrievetmxCatCaoNIRKeysListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class RetrievetmxCatCaoNIRKeysListResponse  implements java.io.Serializable {
    private com.hp.schemas.SM._7.TmxCatCaoNIRKeysType[] keys;

    private com.hp.schemas.SM._7.Common.MessageType[] messages;

    private com.hp.schemas.SM._7.Common.StatusType status;  // attribute

    private java.lang.String message;  // attribute

    private java.util.Date schemaRevisionDate;  // attribute

    private int schemaRevisionLevel;  // attribute

    private java.math.BigDecimal returnCode;  // attribute

    private java.lang.String query;  // attribute

    private java.lang.String handle;  // attribute

    private java.lang.Long count;  // attribute

    private java.lang.Boolean more;  // attribute

    private java.lang.Long start;  // attribute

    public RetrievetmxCatCaoNIRKeysListResponse() {
    }

    public RetrievetmxCatCaoNIRKeysListResponse(
           com.hp.schemas.SM._7.TmxCatCaoNIRKeysType[] keys,
           com.hp.schemas.SM._7.Common.MessageType[] messages,
           com.hp.schemas.SM._7.Common.StatusType status,
           java.lang.String message,
           java.util.Date schemaRevisionDate,
           int schemaRevisionLevel,
           java.math.BigDecimal returnCode,
           java.lang.String query,
           java.lang.String handle,
           java.lang.Long count,
           java.lang.Boolean more,
           java.lang.Long start) {
           this.keys = keys;
           this.messages = messages;
           this.status = status;
           this.message = message;
           this.schemaRevisionDate = schemaRevisionDate;
           this.schemaRevisionLevel = schemaRevisionLevel;
           this.returnCode = returnCode;
           this.query = query;
           this.handle = handle;
           this.count = count;
           this.more = more;
           this.start = start;
    }


    /**
     * Gets the keys value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return keys
     */
    public com.hp.schemas.SM._7.TmxCatCaoNIRKeysType[] getKeys() {
        return keys;
    }


    /**
     * Sets the keys value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param keys
     */
    public void setKeys(com.hp.schemas.SM._7.TmxCatCaoNIRKeysType[] keys) {
        this.keys = keys;
    }

    public com.hp.schemas.SM._7.TmxCatCaoNIRKeysType getKeys(int i) {
        return this.keys[i];
    }

    public void setKeys(int i, com.hp.schemas.SM._7.TmxCatCaoNIRKeysType _value) {
        this.keys[i] = _value;
    }


    /**
     * Gets the messages value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return messages
     */
    public com.hp.schemas.SM._7.Common.MessageType[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param messages
     */
    public void setMessages(com.hp.schemas.SM._7.Common.MessageType[] messages) {
        this.messages = messages;
    }


    /**
     * Gets the status value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return status
     */
    public com.hp.schemas.SM._7.Common.StatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param status
     */
    public void setStatus(com.hp.schemas.SM._7.Common.StatusType status) {
        this.status = status;
    }


    /**
     * Gets the message value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the schemaRevisionDate value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return schemaRevisionDate
     */
    public java.util.Date getSchemaRevisionDate() {
        return schemaRevisionDate;
    }


    /**
     * Sets the schemaRevisionDate value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param schemaRevisionDate
     */
    public void setSchemaRevisionDate(java.util.Date schemaRevisionDate) {
        this.schemaRevisionDate = schemaRevisionDate;
    }


    /**
     * Gets the schemaRevisionLevel value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return schemaRevisionLevel
     */
    public int getSchemaRevisionLevel() {
        return schemaRevisionLevel;
    }


    /**
     * Sets the schemaRevisionLevel value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param schemaRevisionLevel
     */
    public void setSchemaRevisionLevel(int schemaRevisionLevel) {
        this.schemaRevisionLevel = schemaRevisionLevel;
    }


    /**
     * Gets the returnCode value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return returnCode
     */
    public java.math.BigDecimal getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.math.BigDecimal returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the query value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the handle value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return handle
     */
    public java.lang.String getHandle() {
        return handle;
    }


    /**
     * Sets the handle value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param handle
     */
    public void setHandle(java.lang.String handle) {
        this.handle = handle;
    }


    /**
     * Gets the count value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return count
     */
    public java.lang.Long getCount() {
        return count;
    }


    /**
     * Sets the count value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param count
     */
    public void setCount(java.lang.Long count) {
        this.count = count;
    }


    /**
     * Gets the more value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return more
     */
    public java.lang.Boolean getMore() {
        return more;
    }


    /**
     * Sets the more value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param more
     */
    public void setMore(java.lang.Boolean more) {
        this.more = more;
    }


    /**
     * Gets the start value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @return start
     */
    public java.lang.Long getStart() {
        return start;
    }


    /**
     * Sets the start value for this RetrievetmxCatCaoNIRKeysListResponse.
     * 
     * @param start
     */
    public void setStart(java.lang.Long start) {
        this.start = start;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrievetmxCatCaoNIRKeysListResponse)) return false;
        RetrievetmxCatCaoNIRKeysListResponse other = (RetrievetmxCatCaoNIRKeysListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keys==null && other.getKeys()==null) || 
             (this.keys!=null &&
              java.util.Arrays.equals(this.keys, other.getKeys()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.schemaRevisionDate==null && other.getSchemaRevisionDate()==null) || 
             (this.schemaRevisionDate!=null &&
              this.schemaRevisionDate.equals(other.getSchemaRevisionDate()))) &&
            this.schemaRevisionLevel == other.getSchemaRevisionLevel() &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.handle==null && other.getHandle()==null) || 
             (this.handle!=null &&
              this.handle.equals(other.getHandle()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.more==null && other.getMore()==null) || 
             (this.more!=null &&
              this.more.equals(other.getMore()))) &&
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart())));
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
        if (getKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getSchemaRevisionDate() != null) {
            _hashCode += getSchemaRevisionDate().hashCode();
        }
        _hashCode += getSchemaRevisionLevel();
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getHandle() != null) {
            _hashCode += getHandle().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getMore() != null) {
            _hashCode += getMore().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrievetmxCatCaoNIRKeysListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRKeysListResponse"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StatusType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("message");
        attrField.setXmlName(new javax.xml.namespace.QName("", "message"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaRevisionDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "schemaRevisionDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaRevisionLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "schemaRevisionLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("query");
        attrField.setXmlName(new javax.xml.namespace.QName("", "query"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("handle");
        attrField.setXmlName(new javax.xml.namespace.QName("", "handle"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("count");
        attrField.setXmlName(new javax.xml.namespace.QName("", "count"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("more");
        attrField.setXmlName(new javax.xml.namespace.QName("", "more"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("start");
        attrField.setXmlName(new javax.xml.namespace.QName("", "start"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "keys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxCatCaoNIRKeysType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "MessageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "message"));
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
