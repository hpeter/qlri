package resp.qubic;

import resp.general.ResponseAbstract;
import resp.general.ResponseSuccess;
import org.json.JSONArray;
import qubic.QubicReader;
import qubic.QubicSpecification;

public class ResponseQubicRead extends ResponseSuccess {

    public ResponseQubicRead(QubicReader qr) {

        QubicSpecification spec = qr.getSpecification();

        obj.put("id", qr.getID());
        obj.put("code", spec.getCode());
        obj.put("version", spec.getVersion());

        obj.put("execution_start", spec.getExecutionStartUnix());
        obj.put("hash_period_duration", spec.getHashPeriodDuration());
        obj.put("result_period_duration", spec.getResultPeriodDuration());
        obj.put("runtime_limit", spec.getRuntimeLimit());

        obj.put("assembly_list", qr.getAssemblyList());
    }

    public String getID() {
        return obj.getString("id");
    }

    public String getCode() {
        return obj.getString("code");
    }

    public String getVersion() {
        return obj.getString("version");
    }

    public String getApplicationAddress() {
        return obj.getString("application_address");
    }

    public long getExecutionStart() {
        return obj.getLong("execution_start");
    }

    public long getHashPeriodDuration() {
        return obj.getLong("hash_period_duration");
    }

    public long getResultPeriodDuration() {
        return obj.getLong("result_period_duration");
    }

    public long getRuntimeLimit() {
        return obj.getLong("runtime_limit");
    }

    public JSONArray getAssemblyList() {
        return obj.getJSONArray("assembly_list");
    }
}
