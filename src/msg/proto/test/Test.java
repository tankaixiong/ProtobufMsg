package msg.proto.test;

import com.google.protobuf.InvalidProtocolBufferException;

import msg.proto.pojo.UserProto;

/**
 * @author tank
 * @email kaixiong.tan@qq.com
 * @date:2015年10月26日 下午3:43:37
 * @description:
 * @version :0.1
 */

public class Test {

	public static void main(String[] args) throws InvalidProtocolBufferException {
		System.out.println(System.currentTimeMillis());

		UserProto.User.Builder builder = UserProto.User.newBuilder();
		builder.setId(1001);
		builder.setGender("男");
		builder.setName("tank");

		UserProto.User user = builder.build();
		byte[] bt = user.toByteArray();//序列化

		//反序列化
		UserProto.User user2=UserProto.User.parseFrom(bt);
		
		//System.out.println(user2);
		
		System.out.println(System.currentTimeMillis());

	}
}
