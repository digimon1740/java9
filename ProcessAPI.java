import java.util.stream.Stream;

public class ProcessAPI {

	public static void main(String[] args) {
		ProcessHandle processHandle = ProcessHandle.current();

		System.out.println(String.format("pid : %s", processHandle.pid()));
		System.out.println(String.format("isAlive : %s", processHandle.isAlive()));
		System.out.println(String.format("children count : %s", processHandle.children().count()));
		System.out.println(String.format("supportsNormalTermination : %s", processHandle.supportsNormalTermination()));

		ProcessHandle.Info processInfo = processHandle.info();

		System.out.println(String.format("arguments : %s", processInfo.arguments().get()));
		System.out.println(String.format("command : %s", processInfo.command().get()));
		System.out.println(String.format("totalCpuDuration : %s", processInfo.totalCpuDuration().get()));
		System.out.println(String.format("user : %s", processInfo.user().get()));

		System.out.println("============================================================");

		Stream<ProcessHandle> processStream = ProcessHandle.allProcesses();

		processStream.forEach((ProcessHandle _processHandle) -> {
			System.out.println(_processHandle);
			System.out.println(String.format("pid : %s", _processHandle.pid()));
			System.out.println(String.format("isAlive : %s", _processHandle.isAlive()));
			System.out.println(String.format("children count : %s", _processHandle.children().count()));
			System.out.println(String.format("supportsNormalTermination : %s", _processHandle.supportsNormalTermination()));

			ProcessHandle.Info _processInfo = _processHandle.info();

			System.out.println(String.format("arguments : %s", _processInfo.arguments().get()));
			System.out.println(String.format("command : %s", _processInfo.command().get()));
			System.out.println(String.format("totalCpuDuration : %s", _processInfo.totalCpuDuration().get()));
			System.out.println(String.format("user : %s", _processInfo.user().get()));
			System.out.println("============================================================");
		});

		//processHandle.destroy();
	}

}
