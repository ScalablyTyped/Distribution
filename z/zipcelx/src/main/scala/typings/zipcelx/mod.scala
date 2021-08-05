package typings.zipcelx

import typings.std.Blob
import typings.zipcelx.zipcelxStrings.number
import typings.zipcelx.zipcelxStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipcelx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: ZipCelXConfig): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  
  trait ZipCelXCell extends StObject {
    
    /**
      * The cell value type
      */
    var `type`: string | number
    
    /**
      * The cell value
      */
    var value: String | Double
  }
  object ZipCelXCell {
    
    inline def apply(`type`: string | number, value: String | Double): ZipCelXCell = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZipCelXCell]
    }
    
    extension [Self <: ZipCelXCell](x: Self) {
      
      inline def setType(value: string | number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZipCelXConfig extends StObject {
    
    /**
      * The file name of the exported file
      */
    var filename: String
    
    /**
      * The sheet to be exported as an .xlsx file
      */
    var sheet: ZipCelXSheet
  }
  object ZipCelXConfig {
    
    inline def apply(filename: String, sheet: ZipCelXSheet): ZipCelXConfig = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZipCelXConfig]
    }
    
    extension [Self <: ZipCelXConfig](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setSheet(value: ZipCelXSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    }
  }
  
  type ZipCelXDataSet = js.Array[ZipCelXRow]
  
  type ZipCelXRow = js.Array[ZipCelXCell]
  
  trait ZipCelXSheet extends StObject {
    
    /**
      * The sheet's DataSet
      */
    var data: ZipCelXDataSet
  }
  object ZipCelXSheet {
    
    inline def apply(data: ZipCelXDataSet): ZipCelXSheet = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZipCelXSheet]
    }
    
    extension [Self <: ZipCelXSheet](x: Self) {
      
      inline def setData(value: ZipCelXDataSet): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ZipCelXRow*): Self = StObject.set(x, "data", js.Array(value :_*))
    }
  }
}
