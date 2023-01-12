package typings.zongji

import org.scalablytyped.runtime.StringDictionary
import typings.mysql.mod.Connection
import typings.mysql.mod.ConnectionConfig
import typings.mysql.mod.MysqlError
import typings.mysql.mod.Pool
import typings.zongji.mod.ZongJi.ZongJi
import typings.zongji.zongjiStrings.binlog
import typings.zongji.zongjiStrings.error
import typings.zongji.zongjiStrings.ready
import typings.zongji.zongjiStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zongji", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ZongJi {
    def this(dsn: String) = this()
    def this(dsn: Connection) = this()
    def this(dsn: ConnectionConfig) = this()
    def this(dsn: Pool) = this()
  }
  
  object ZongJi {
    
    trait Event
      extends StObject
         with /**
      * Event properties (varies by event)
      */
    /* key */ StringDictionary[Any] {
      
      /**
        * Log a description of the event to the console
        */
      def dump(): Unit
      
      /**
        * Return the name of the event
        */
      def getEventName(): String
    }
    object Event {
      
      inline def apply(dump: () => Unit, getEventName: () => String): Event = {
        val __obj = js.Dynamic.literal(dump = js.Any.fromFunction0(dump), getEventName = js.Any.fromFunction0(getEventName))
        __obj.asInstanceOf[Event]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
        
        inline def setDump(value: () => Unit): Self = StObject.set(x, "dump", js.Any.fromFunction0(value))
        
        inline def setGetEventName(value: () => String): Self = StObject.set(x, "getEventName", js.Any.fromFunction0(value))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.zongji.zongjiStrings.unknown
      - typings.zongji.zongjiStrings.query
      - typings.zongji.zongjiStrings.intvar
      - typings.zongji.zongjiStrings.rotate
      - typings.zongji.zongjiStrings.format
      - typings.zongji.zongjiStrings.xid
      - typings.zongji.zongjiStrings.tablemap
      - typings.zongji.zongjiStrings.writerows
      - typings.zongji.zongjiStrings.updaterows
      - typings.zongji.zongjiStrings.deleterows
    */
    trait EventTypes extends StObject
    object EventTypes {
      
      inline def deleterows: typings.zongji.zongjiStrings.deleterows = "deleterows".asInstanceOf[typings.zongji.zongjiStrings.deleterows]
      
      inline def format: typings.zongji.zongjiStrings.format = "format".asInstanceOf[typings.zongji.zongjiStrings.format]
      
      inline def intvar: typings.zongji.zongjiStrings.intvar = "intvar".asInstanceOf[typings.zongji.zongjiStrings.intvar]
      
      inline def query: typings.zongji.zongjiStrings.query = "query".asInstanceOf[typings.zongji.zongjiStrings.query]
      
      inline def rotate: typings.zongji.zongjiStrings.rotate = "rotate".asInstanceOf[typings.zongji.zongjiStrings.rotate]
      
      inline def tablemap: typings.zongji.zongjiStrings.tablemap = "tablemap".asInstanceOf[typings.zongji.zongjiStrings.tablemap]
      
      inline def unknown: typings.zongji.zongjiStrings.unknown = "unknown".asInstanceOf[typings.zongji.zongjiStrings.unknown]
      
      inline def updaterows: typings.zongji.zongjiStrings.updaterows = "updaterows".asInstanceOf[typings.zongji.zongjiStrings.updaterows]
      
      inline def writerows: typings.zongji.zongjiStrings.writerows = "writerows".asInstanceOf[typings.zongji.zongjiStrings.writerows]
      
      inline def xid: typings.zongji.zongjiStrings.xid = "xid".asInstanceOf[typings.zongji.zongjiStrings.xid]
    }
    
    type Schema = StringDictionary[Boolean | js.Array[String]]
    
    trait StartOptions extends StObject {
      
      /**
        * Array of event names to exclude.
        */
      var excludeEvents: js.UndefOr[js.Array[EventTypes]] = js.undefined
      
      /**
        * Object describing which databases and tables to exclude.
        */
      var excludeSchema: js.UndefOr[Schema] = js.undefined
      
      /**
        * Begin reading events from this binlog file. If specified together with position, will take precedence over startAtEnd.
        */
      var filename: js.UndefOr[String] = js.undefined
      
      /**
        * Array of event names to include.
        */
      var includeEvents: js.UndefOr[js.Array[EventTypes]] = js.undefined
      
      /**
        * Object describing which databases and tables to include (Only for row events). Use database names as the key and pass
        * an array of table names or true (for the entire database).
        */
      var includeSchema: js.UndefOr[Schema] = js.undefined
      
      /**
        * Begin reading events from this position. Must be included with filename.
        */
      var position: js.UndefOr[Double] = js.undefined
      
      /**
        * Unique number to identify this replication slave instance. Must be specified if running more than one instance of ZongJi.
        * Must be used in start() method for effect.
        * @default 1
        */
      var serverId: js.UndefOr[Double] = js.undefined
      
      /**
        * Pass true to only emit binlog events that occur after ZongJi's instantiation. Must be used in start() method for effect.
        * @default false
        */
      var startAtEnd: js.UndefOr[Boolean] = js.undefined
    }
    object StartOptions {
      
      inline def apply(): StartOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StartOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StartOptions] (val x: Self) extends AnyVal {
        
        inline def setExcludeEvents(value: js.Array[EventTypes]): Self = StObject.set(x, "excludeEvents", value.asInstanceOf[js.Any])
        
        inline def setExcludeEventsUndefined: Self = StObject.set(x, "excludeEvents", js.undefined)
        
        inline def setExcludeEventsVarargs(value: EventTypes*): Self = StObject.set(x, "excludeEvents", js.Array(value*))
        
        inline def setExcludeSchema(value: Schema): Self = StObject.set(x, "excludeSchema", value.asInstanceOf[js.Any])
        
        inline def setExcludeSchemaUndefined: Self = StObject.set(x, "excludeSchema", js.undefined)
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
        
        inline def setIncludeEvents(value: js.Array[EventTypes]): Self = StObject.set(x, "includeEvents", value.asInstanceOf[js.Any])
        
        inline def setIncludeEventsUndefined: Self = StObject.set(x, "includeEvents", js.undefined)
        
        inline def setIncludeEventsVarargs(value: EventTypes*): Self = StObject.set(x, "includeEvents", js.Array(value*))
        
        inline def setIncludeSchema(value: Schema): Self = StObject.set(x, "includeSchema", value.asInstanceOf[js.Any])
        
        inline def setIncludeSchemaUndefined: Self = StObject.set(x, "includeSchema", js.undefined)
        
        inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setServerId(value: Double): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
        
        inline def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
        
        inline def setStartAtEnd(value: Boolean): Self = StObject.set(x, "startAtEnd", value.asInstanceOf[js.Any])
        
        inline def setStartAtEndUndefined: Self = StObject.set(x, "startAtEnd", js.undefined)
      }
    }
    
    @js.native
    trait ZongJi extends StObject {
      
      /**
        * 'ready': This event occurred right after ZongJi successfully established a connection, setup slave status, and set binlog position.
        * 'stopped': Emitted when ZongJi connection is stopped (ZongJi#stop is called).
        */
      def on(event: ready | stopped, handler: js.Function0[Unit]): Unit = js.native
      /**
        * Once a binlog is received and passes the filter, it will bubble up with this event.
        */
      @JSName("on")
      def on_binlog(event: binlog, handler: js.Function1[/* event */ Event, Unit]): Unit = js.native
      /**
        * Every error will be caught by this event.
        */
      @JSName("on")
      def on_error(event: error, handler: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
      
      /**
        * Start receiving replication events.
        */
      def start(): Unit = js.native
      def start(options: StartOptions): Unit = js.native
      
      /**
        * Disconnect from MySQL server, stop receiving events.
        */
      def stop(): Unit = js.native
    }
  }
}
