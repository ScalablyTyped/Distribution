package typings.zxingTextEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Encodings extends StObject {
    
    var encodings: js.Array[Labels]
    
    var heading: String
  }
  object Encodings {
    
    inline def apply(encodings: js.Array[Labels], heading: String): Encodings = {
      val __obj = js.Dynamic.literal(encodings = encodings.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encodings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encodings] (val x: Self) extends AnyVal {
      
      inline def setEncodings(value: js.Array[Labels]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
      
      inline def setEncodingsVarargs(value: Labels*): Self = StObject.set(x, "encodings", js.Array(value*))
      
      inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fatal extends StObject {
    
    var fatal: Boolean
  }
  object Fatal {
    
    inline def apply(fatal: Boolean): Fatal = {
      val __obj = js.Dynamic.literal(fatal = fatal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fatal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fatal] (val x: Self) extends AnyVal {
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    }
  }
  
  trait FatalAny extends StObject {
    
    var fatal: Any
  }
  object FatalAny {
    
    inline def apply(fatal: Any): FatalAny = {
      val __obj = js.Dynamic.literal(fatal = fatal.asInstanceOf[js.Any])
      __obj.asInstanceOf[FatalAny]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FatalAny] (val x: Self) extends AnyVal {
      
      inline def setFatal(value: Any): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    }
  }
  
  trait Labels extends StObject {
    
    var labels: js.Array[String]
    
    var name: String
  }
  object Labels {
    
    inline def apply(labels: js.Array[String], name: String): Labels = {
      val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Labels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
      
      inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
