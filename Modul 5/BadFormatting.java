package counter;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class BadFormatting{

	private     Socket          socket;
	private     InputStream     input;
	private     OutputStream    output;
	private     Request         request;
	private     Response        response;
	private     FitNesseContext context;
	protected   long            requestParsingTimeLimit;
	private     long            requestProgress;
	private     long            requestParsingDeadline;
	private     boolean         hasError;
	
}
