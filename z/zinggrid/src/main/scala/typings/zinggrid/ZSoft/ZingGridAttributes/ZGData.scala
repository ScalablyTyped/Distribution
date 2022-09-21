package typings.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGData extends StObject {
  
  /**
    * @description Adapter is a shortcut to set known options for specific third party datasets.  Currently supports "graphql" and  "firebase".
    * Developers could register their own custom adapters.  For more information on custom adapters, visit Guides > ZingGrid Object > registerAdapter().
    */
  var adapter: js.UndefOr[String] = js.undefined
  
  /**
    * @description Data for the grid presented as an array or object.  If set as an attribute value, the
    * data needs to be in JSON format.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * @description In the case of non-key based objects, the idKey can be set to indicate the id to send back to the datasource on CRUD commands.
    * For example, if the READ URL was https://zinggrid-named.firebaseio.com/ then the UPDATE would be https://zinggrid-named.firebaseio.com/VALUE_OF_IDKEY.
    */
  var idKey: js.UndefOr[String] = js.undefined
  
  /**
    * @description Used to set "<zg-param>", the configuration data for "<zg-data>".  This should never be used directly as an attribute and
    * is meant for object instantiation and for setting in JavaScript.
    */
  var options: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Specifies the absolute or relative URL to fetch data from to populate the grid
    */
  var src: js.UndefOr[String] = js.undefined
}
object ZGData {
  
  inline def apply(): ZGData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGData]
  }
  
  extension [Self <: ZGData](x: Self) {
    
    inline def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIdKey(value: String): Self = StObject.set(x, "idKey", value.asInstanceOf[js.Any])
    
    inline def setIdKeyUndefined: Self = StObject.set(x, "idKey", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
