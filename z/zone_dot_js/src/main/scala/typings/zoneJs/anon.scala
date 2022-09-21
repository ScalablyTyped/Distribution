package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ADDEVENTLISTENERSTR extends StObject {
    
    var ADD_EVENT_LISTENER_STR: String
    
    var FALSE_STR: String
    
    var REMOVE_EVENT_LISTENER_STR: String
    
    var TRUE_STR: String
    
    var ZONE_SYMBOL_PREFIX: String
    
    var eventNames: js.Array[String]
    
    var globalSources: Any
    
    var isBrowser: Boolean
    
    var isMix: Boolean
    
    var isNode: Boolean
    
    var zoneSymbolEventNames: Any
  }
  object ADDEVENTLISTENERSTR {
    
    inline def apply(
      ADD_EVENT_LISTENER_STR: String,
      FALSE_STR: String,
      REMOVE_EVENT_LISTENER_STR: String,
      TRUE_STR: String,
      ZONE_SYMBOL_PREFIX: String,
      eventNames: js.Array[String],
      globalSources: Any,
      isBrowser: Boolean,
      isMix: Boolean,
      isNode: Boolean,
      zoneSymbolEventNames: Any
    ): ADDEVENTLISTENERSTR = {
      val __obj = js.Dynamic.literal(ADD_EVENT_LISTENER_STR = ADD_EVENT_LISTENER_STR.asInstanceOf[js.Any], FALSE_STR = FALSE_STR.asInstanceOf[js.Any], REMOVE_EVENT_LISTENER_STR = REMOVE_EVENT_LISTENER_STR.asInstanceOf[js.Any], TRUE_STR = TRUE_STR.asInstanceOf[js.Any], ZONE_SYMBOL_PREFIX = ZONE_SYMBOL_PREFIX.asInstanceOf[js.Any], eventNames = eventNames.asInstanceOf[js.Any], globalSources = globalSources.asInstanceOf[js.Any], isBrowser = isBrowser.asInstanceOf[js.Any], isMix = isMix.asInstanceOf[js.Any], isNode = isNode.asInstanceOf[js.Any], zoneSymbolEventNames = zoneSymbolEventNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[ADDEVENTLISTENERSTR]
    }
    
    extension [Self <: ADDEVENTLISTENERSTR](x: Self) {
      
      inline def setADD_EVENT_LISTENER_STR(value: String): Self = StObject.set(x, "ADD_EVENT_LISTENER_STR", value.asInstanceOf[js.Any])
      
      inline def setEventNames(value: js.Array[String]): Self = StObject.set(x, "eventNames", value.asInstanceOf[js.Any])
      
      inline def setEventNamesVarargs(value: String*): Self = StObject.set(x, "eventNames", js.Array(value*))
      
      inline def setFALSE_STR(value: String): Self = StObject.set(x, "FALSE_STR", value.asInstanceOf[js.Any])
      
      inline def setGlobalSources(value: Any): Self = StObject.set(x, "globalSources", value.asInstanceOf[js.Any])
      
      inline def setIsBrowser(value: Boolean): Self = StObject.set(x, "isBrowser", value.asInstanceOf[js.Any])
      
      inline def setIsMix(value: Boolean): Self = StObject.set(x, "isMix", value.asInstanceOf[js.Any])
      
      inline def setIsNode(value: Boolean): Self = StObject.set(x, "isNode", value.asInstanceOf[js.Any])
      
      inline def setREMOVE_EVENT_LISTENER_STR(value: String): Self = StObject.set(x, "REMOVE_EVENT_LISTENER_STR", value.asInstanceOf[js.Any])
      
      inline def setTRUE_STR(value: String): Self = StObject.set(x, "TRUE_STR", value.asInstanceOf[js.Any])
      
      inline def setZONE_SYMBOL_PREFIX(value: String): Self = StObject.set(x, "ZONE_SYMBOL_PREFIX", value.asInstanceOf[js.Any])
      
      inline def setZoneSymbolEventNames(value: Any): Self = StObject.set(x, "zoneSymbolEventNames", value.asInstanceOf[js.Any])
    }
  }
}
