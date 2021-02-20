package typings.yui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Y {
  
  @js.native
  trait IConfig extends StObject {
    
    var optional: js.Array[String] = js.native
    
    var requires: js.Array[String] = js.native
    
    var use: js.Array[String] = js.native
  }
  object IConfig {
    
    @scala.inline
    def apply(optional: js.Array[String], requires: js.Array[String], use: js.Array[String]): IConfig = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], requires = requires.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfig]
    }
    
    @scala.inline
    implicit class IConfigMutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptional(value: js.Array[String]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalVarargs(value: String*): Self = StObject.set(x, "optional", js.Array(value :_*))
      
      @scala.inline
      def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
      
      @scala.inline
      def setUse(value: js.Array[String]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseVarargs(value: String*): Self = StObject.set(x, "use", js.Array(value :_*))
    }
  }
}
