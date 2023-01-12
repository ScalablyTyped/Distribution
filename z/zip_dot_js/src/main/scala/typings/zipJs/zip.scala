package typings.zipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zip {
  
  type BlobReader = Reader
  
  type BlobWriter = Writer
  
  type Data64URIReader = Reader
  
  type Data64URIWriter = Writer
  
  @js.native
  trait Entry extends StObject {
    
    var comment: String = js.native
    
    var compressedSize: Double = js.native
    
    var crc32: Double = js.native
    
    var directory: Boolean = js.native
    
    var filename: String = js.native
    
    def getData(writer: Writer, onend: js.Function1[/* result */ Any, Unit]): Unit = js.native
    def getData(
      writer: Writer,
      onend: js.Function1[/* result */ Any, Unit],
      onprogress: js.Function2[/* progress */ Double, /* total */ Double, Unit]
    ): Unit = js.native
    def getData(
      writer: Writer,
      onend: js.Function1[/* result */ Any, Unit],
      onprogress: js.Function2[/* progress */ Double, /* total */ Double, Unit],
      checkCrc32: Boolean
    ): Unit = js.native
    def getData(writer: Writer, onend: js.Function1[/* result */ Any, Unit], onprogress: Unit, checkCrc32: Boolean): Unit = js.native
    
    var lastModDate: js.Date = js.native
    
    var lastModDateRaw: Double = js.native
    
    var uncompressedSize: Double = js.native
  }
  
  type FileWriter = Writer
  
  type HttpReader = Reader
  
  @js.native
  trait Reader extends StObject {
    
    def init(callback: js.Function0[Unit], onerror: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    def readUint8Array(index: Double, length: Double, callback: js.Function1[/* result */ js.typedarray.Uint8Array, Unit]): Unit = js.native
    def readUint8Array(
      index: Double,
      length: Double,
      callback: js.Function1[/* result */ js.typedarray.Uint8Array, Unit],
      onerror: js.Function1[/* error */ Any, Unit]
    ): Unit = js.native
    
    var size: Double = js.native
  }
  
  type TextReader = Reader
  
  type TextWriter = Writer
  
  trait WriteOptions extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var directory: js.UndefOr[Boolean] = js.undefined
    
    var lastModDate: js.UndefOr[js.Date] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setLastModDate(value: js.Date): Self = StObject.set(x, "lastModDate", value.asInstanceOf[js.Any])
      
      inline def setLastModDateUndefined: Self = StObject.set(x, "lastModDate", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Writer extends StObject {
    
    def getData(callback: js.Function1[/* data */ Any, Unit]): Unit = js.native
    def getData(callback: js.Function1[/* data */ Any, Unit], onerror: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    def init(callback: js.Function0[Unit]): Unit = js.native
    def init(callback: js.Function0[Unit], onerror: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    def writeUint8Array(array: js.typedarray.Uint8Array, callback: js.Function0[Unit]): Unit = js.native
    def writeUint8Array(
      array: js.typedarray.Uint8Array,
      callback: js.Function0[Unit],
      onerror: js.Function1[/* error */ Any, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait ZipReader extends StObject {
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    def getEntries(callback: js.Function1[/* entries */ js.Array[Entry], Unit]): Unit = js.native
  }
  
  @js.native
  trait ZipWriter extends StObject {
    
    def add(name: String, reader: Reader, onend: js.Function0[Unit]): Unit = js.native
    def add(
      name: String,
      reader: Reader,
      onend: js.Function0[Unit],
      onprogress: js.Function2[/* progress */ Double, /* total */ Double, Unit]
    ): Unit = js.native
    def add(
      name: String,
      reader: Reader,
      onend: js.Function0[Unit],
      onprogress: js.Function2[/* progress */ Double, /* total */ Double, Unit],
      options: WriteOptions
    ): Unit = js.native
    def add(name: String, reader: Reader, onend: js.Function0[Unit], onprogress: Unit, options: WriteOptions): Unit = js.native
    
    def close(callback: js.Function1[/* result */ Any, Unit]): Unit = js.native
  }
}
