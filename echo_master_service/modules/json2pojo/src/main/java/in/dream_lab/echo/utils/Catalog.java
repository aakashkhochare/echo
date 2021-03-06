
package in.dream_lab.echo.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "catalogue-metadata",
    "items"
})
public class Catalog {

    @JsonProperty("catalogue-metadata")
    private List<Object> catalogueMetadata = new ArrayList<Object>();
    @JsonProperty("items")
    private List<Object> items = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("catalogue-metadata")
    public List<Object> getCatalogueMetadata() {
        return catalogueMetadata;
    }

    @JsonProperty("catalogue-metadata")
    public void setCatalogueMetadata(List<Object> catalogueMetadata) {
        this.catalogueMetadata = catalogueMetadata;
    }

    @JsonProperty("items")
    public List<Object> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Object> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(catalogueMetadata).append(items).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Catalog) == false) {
            return false;
        }
        Catalog rhs = ((Catalog) other);
        return new EqualsBuilder().append(catalogueMetadata, rhs.catalogueMetadata).append(items, rhs.items).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
