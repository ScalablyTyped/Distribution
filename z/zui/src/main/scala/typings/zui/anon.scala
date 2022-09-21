package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Change extends StObject {
    
    var change: String
    
    var colIndex: Double
    
    var newWidth: Double
    
    var oldWidth: Double
  }
  object Change {
    
    inline def apply(change: String, colIndex: Double, newWidth: Double, oldWidth: Double): Change = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], colIndex = colIndex.asInstanceOf[js.Any], newWidth = newWidth.asInstanceOf[js.Any], oldWidth = oldWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Change]
    }
    
    extension [Self <: Change](x: Self) {
      
      inline def setChange(value: String): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
      
      inline def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
      
      inline def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckedAll extends StObject {
    
    var checkedAll: Boolean
    
    var checks: js.Array[Double]
  }
  object CheckedAll {
    
    inline def apply(checkedAll: Boolean, checks: js.Array[Double]): CheckedAll = {
      val __obj = js.Dynamic.literal(checkedAll = checkedAll.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckedAll]
    }
    
    extension [Self <: CheckedAll](x: Self) {
      
      inline def setCheckedAll(value: Boolean): Self = StObject.set(x, "checkedAll", value.asInstanceOf[js.Any])
      
      inline def setChecks(value: js.Array[Double]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setChecksVarargs(value: Double*): Self = StObject.set(x, "checks", js.Array(value*))
    }
  }
  
  trait Crop extends StObject {
    
    var crop: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var preserve_headers: js.UndefOr[Boolean] = js.undefined
    
    var quuality: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Crop {
    
    inline def apply(): Crop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Crop]
    }
    
    extension [Self <: Crop](x: Self) {
      
      inline def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPreserve_headers(value: Boolean): Self = StObject.set(x, "preserve_headers", value.asInstanceOf[js.Any])
      
      inline def setPreserve_headersUndefined: Self = StObject.set(x, "preserve_headers", js.undefined)
      
      inline def setQuuality(value: Double): Self = StObject.set(x, "quuality", value.asInstanceOf[js.Any])
      
      inline def setQuualityUndefined: Self = StObject.set(x, "quuality", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: ERRORS
    
    var file: FileObj
    
    var message: String
  }
  object Error {
    
    inline def apply(error: ERRORS, file: FileObj, message: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: ERRORS): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFile(value: FileObj): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extensions extends StObject {
    
    var extensions: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Extensions {
    
    inline def apply(): Extensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extensions]
    }
    
    extension [Self <: Extensions](x: Self) {
      
      inline def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var origSize: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Id {
    
    inline def apply(): Id = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrigSize(value: String): Self = StObject.set(x, "origSize", value.asInstanceOf[js.Any])
      
      inline def setOrigSizeUndefined: Self = StObject.set(x, "origSize", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var sortUp: Boolean
  }
  object Index {
    
    inline def apply(index: Double, sortUp: Boolean): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], sortUp = sortUp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSortUp(value: Boolean): Self = StObject.set(x, "sortUp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Maxfilesize extends StObject {
    
    var max_file_size: js.UndefOr[String] = js.undefined
    
    var mime_type: js.Array[Extensions]
    
    var prevent_duplicates: js.UndefOr[String] = js.undefined
  }
  object Maxfilesize {
    
    inline def apply(mime_type: js.Array[Extensions]): Maxfilesize = {
      val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Maxfilesize]
    }
    
    extension [Self <: Maxfilesize](x: Self) {
      
      inline def setMax_file_size(value: String): Self = StObject.set(x, "max_file_size", value.asInstanceOf[js.Any])
      
      inline def setMax_file_sizeUndefined: Self = StObject.set(x, "max_file_size", js.undefined)
      
      inline def setMime_type(value: js.Array[Extensions]): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
      
      inline def setMime_typeVarargs(value: Extensions*): Self = StObject.set(x, "mime_type", js.Array(value*))
      
      inline def setPrevent_duplicates(value: String): Self = StObject.set(x, "prevent_duplicates", value.asInstanceOf[js.Any])
      
      inline def setPrevent_duplicatesUndefined: Self = StObject.set(x, "prevent_duplicates", js.undefined)
    }
  }
}
