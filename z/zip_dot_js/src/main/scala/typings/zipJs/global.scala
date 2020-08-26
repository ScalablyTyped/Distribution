package typings.zipJs

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object zip extends js.Object {
    @js.native
    class BlobReader protected ()
      extends typings.zipJs.zip.Reader {
      def this(blob: Blob) = this()
    }
    
    @js.native
    class BlobWriter protected ()
      extends typings.zipJs.zip.Writer {
      def this(contentType: String) = this()
    }
    
    @js.native
    class Data64URIReader protected ()
      extends typings.zipJs.zip.Reader {
      def this(dataURI: String) = this()
    }
    
    @js.native
    class Data64URIWriter ()
      extends typings.zipJs.zip.Writer {
      def this(mimeString: String) = this()
    }
    
    @js.native
    class FileWriter protected ()
      extends typings.zipJs.zip.Writer {
      def this(fileEntry: FileEntry) = this()
    }
    
    @js.native
    class HttpReader protected ()
      extends typings.zipJs.zip.Reader {
      def this(url: String) = this()
    }
    
    @js.native
    class Reader ()
      extends typings.zipJs.zip.Reader
    
    @js.native
    class TextReader protected ()
      extends typings.zipJs.zip.Reader {
      def this(text: String) = this()
    }
    
    @js.native
    class TextWriter protected ()
      extends typings.zipJs.zip.Writer {
      def this(encoding: String) = this()
    }
    
    @js.native
    class Writer ()
      extends typings.zipJs.zip.Writer
    
    @js.native
    class ZipReader ()
      extends typings.zipJs.zip.ZipReader
    
    @js.native
    class ZipWriter ()
      extends typings.zipJs.zip.ZipWriter
    
    var useWebWorkers: Boolean = js.native
    var workerScriptsPath: String = js.native
    def createReader(
      reader: typings.zipJs.zip.Reader,
      callback: js.Function1[/* zipReader */ typings.zipJs.zip.ZipReader, Unit]
    ): Unit = js.native
    def createReader(
      reader: typings.zipJs.zip.Reader,
      callback: js.Function1[/* zipReader */ typings.zipJs.zip.ZipReader, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
    def createWriter(
      writer: typings.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typings.zipJs.zip.ZipWriter, Unit]
    ): Unit = js.native
    def createWriter(
      writer: typings.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typings.zipJs.zip.ZipWriter, Unit],
      onerror: js.UndefOr[scala.Nothing],
      dontDeflate: Boolean
    ): Unit = js.native
    def createWriter(
      writer: typings.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typings.zipJs.zip.ZipWriter, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
    def createWriter(
      writer: typings.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typings.zipJs.zip.ZipWriter, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit],
      dontDeflate: Boolean
    ): Unit = js.native
    @js.native
    object workerScripts extends js.Object {
      var deflater: js.UndefOr[js.Array[String]] = js.native
      var inflater: js.UndefOr[js.Array[String]] = js.native
    }
    
  }
  
}

