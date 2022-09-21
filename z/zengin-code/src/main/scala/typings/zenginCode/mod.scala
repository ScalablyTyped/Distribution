package typings.zenginCode

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("zengin-code", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ZenginCode = js.native
  
  trait Bank extends StObject {
    
    var branches: StringDictionary[Branch]
    
    var code: String
    
    var hira: String
    
    var kana: String
    
    var name: String
    
    var roma: String
  }
  object Bank {
    
    inline def apply(
      branches: StringDictionary[Branch],
      code: String,
      hira: String,
      kana: String,
      name: String,
      roma: String
    ): Bank = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], hira = hira.asInstanceOf[js.Any], kana = kana.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roma = roma.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bank]
    }
    
    extension [Self <: Bank](x: Self) {
      
      inline def setBranches(value: StringDictionary[Branch]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setHira(value: String): Self = StObject.set(x, "hira", value.asInstanceOf[js.Any])
      
      inline def setKana(value: String): Self = StObject.set(x, "kana", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRoma(value: String): Self = StObject.set(x, "roma", value.asInstanceOf[js.Any])
    }
  }
  
  trait Branch extends StObject {
    
    var code: String
    
    var hira: String
    
    var kana: String
    
    var name: String
    
    var roma: String
  }
  object Branch {
    
    inline def apply(code: String, hira: String, kana: String, name: String, roma: String): Branch = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], hira = hira.asInstanceOf[js.Any], kana = kana.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roma = roma.asInstanceOf[js.Any])
      __obj.asInstanceOf[Branch]
    }
    
    extension [Self <: Branch](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setHira(value: String): Self = StObject.set(x, "hira", value.asInstanceOf[js.Any])
      
      inline def setKana(value: String): Self = StObject.set(x, "kana", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRoma(value: String): Self = StObject.set(x, "roma", value.asInstanceOf[js.Any])
    }
  }
  
  type ZenginCode = StringDictionary[Bank]
  
  type _To = js.Object & ZenginCode
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ZenginCode = ^
}
