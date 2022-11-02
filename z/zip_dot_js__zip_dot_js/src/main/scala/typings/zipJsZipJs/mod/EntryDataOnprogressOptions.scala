package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents options passed to {@link Entry#getData}, {@link ZipWriter.add} and `{@link ZipDirectory}.export*`.
  */
trait EntryDataOnprogressOptions extends StObject {
  
  /**
    * The function called when ending compression/decompression.
    * 
    * @param computedSize The total number of bytes (computed).
    * @returns An empty promise or `undefined`.
    */
  var onend: js.UndefOr[js.Function1[/* computedSize */ Double, js.UndefOr[js.Promise[Unit]]]] = js.undefined
  
  /**
    * The function called during compression/decompression.
    * 
    * @param progress The current progress in bytes.
    * @param total The total number of bytes.
    * @returns An empty promise or `undefined`.
    */
  var onprogress: js.UndefOr[
    js.Function2[/* progress */ Double, /* total */ Double, js.UndefOr[js.Promise[Unit]]]
  ] = js.undefined
  
  /**
    * The function called when starting compression/decompression.
    * 
    * @param total The total number of bytes.
    * @returns An empty promise or `undefined`.
    */
  var onstart: js.UndefOr[js.Function1[/* total */ Double, js.UndefOr[js.Promise[Unit]]]] = js.undefined
}
object EntryDataOnprogressOptions {
  
  inline def apply(): EntryDataOnprogressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntryDataOnprogressOptions]
  }
  
  extension [Self <: EntryDataOnprogressOptions](x: Self) {
    
    inline def setOnend(value: /* computedSize */ Double => js.UndefOr[js.Promise[Unit]]): Self = StObject.set(x, "onend", js.Any.fromFunction1(value))
    
    inline def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
    
    inline def setOnprogress(value: (/* progress */ Double, /* total */ Double) => js.UndefOr[js.Promise[Unit]]): Self = StObject.set(x, "onprogress", js.Any.fromFunction2(value))
    
    inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    
    inline def setOnstart(value: /* total */ Double => js.UndefOr[js.Promise[Unit]]): Self = StObject.set(x, "onstart", js.Any.fromFunction1(value))
    
    inline def setOnstartUndefined: Self = StObject.set(x, "onstart", js.undefined)
  }
}
