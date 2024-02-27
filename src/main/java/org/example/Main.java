package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        writeFile();
        readFile();
    }

    private static void readFile() throws IOException {
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/ReadAndWriteFile.txt");
        file.createNewFile();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String s;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }

    }

    private static void writeFile() throws Exception {
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/ReadAndWriteFile.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("service: " +
                "ACCOUNTS_FOLDER_PREFIX=/;BATCH_SERVICE_HOST=localhost;BATCH_SERVICE_PORT=3012;CONFIG_DB_NAME=sec_lending;CONFIG_DB_PASSWORD=iPQPwy8H]LuKx3hz;CONFIG_DB_READ_HOST=10.175.32.152;CONFIG_DB_READ_PORT=5432;CONFIG_DB_USER=postgres;CONFIG_DB_WRITE_HOST=10.175.32.152;CONFIG_DB_WRITE_PORT=5432;EMPLOYEE_API_URL=https://dashboard.drivewealth.tech/api/employees/me;SECLENDING_DATA_HOST=localhost;SECLENDING_DATA_PORT=3008;SECLENDING_SERVICE_HOST=localhost;SECLENDING_SERVICE_PORT=3007;STORAGE_MGNT_HOST=localhost;STORAGE_MGNT_PORT=3009 " +
                "Data Service: " +
                "CONFIG_DB_NAME=sec_lending;CONFIG_DB_PASSWORD=iPQPwy8H]LuKx3hz;CONFIG_DB_READ_HOST=10.175.32.152;CONFIG_DB_READ_PORT=5432;CONFIG_DB_USER=postgres;CONFIG_DB_WRITE_HOST=10.175.32.152;CONFIG_DB_WRITE_PORT=5432 " +
                "Job Service: " +
                "AWS_S3_ACCESSKEY=AKIARFPXVTINESPEHZXD;AWS_S3_BUCKET=dw-pt-documents;AWS_S3_REGION=us-east-1;AWS_S3_SECRETKEY=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;BATCH_SERVICE_HOST=localhost;BATCH_SERVICE_PORT=3012;BROKER_FOLDER_PREFIX=/245_DRIVEWEALTH_LLC/;COLLATERAL_FOLDER_PREFIX=/245_DRIVEWEALTH_LLC/;CONFIG_DB_NAME=sec_lending;CONFIG_DB_PASSWORD=iPQPwy8H]LuKx3hz;CONFIG_DB_READ_HOST=10.175.32.152;CONFIG_DB_READ_PORT=5432;CONFIG_DB_USER=postgres;CONFIG_DB_WRITE_HOST=10.175.32.152;CONFIG_DB_WRITE_PORT=5432;CONFIG_SLACK_URI=https://hooks.slack.com/services/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;G_SERVICE_ACCOUNT_EMAIL=app-354@drive123-333112.iam.gserviceaccount.com;G_SERVICE_ACCOUNT_KEY=seclending-d7eac59b8a66.json;G_SERVICE_APPLICATION_NAME=drive123;G_SERVICE_FOLDER_ID=false;G_SERVICE_ROOT_DIR=1D0lCaXaBnAWVKseV0VXx9ZTRVGxVmniD;GOOGLEDRIVE_FOLDER_PREFIX=TEST/DEV/;JOB_AXOS_TRIGGER=0 0 13 * * *;JOB_CLIENTDAILY_TRIGGER=0 15 22 * * *;JOB_CLIENTEOM_TRIGGER=0 0 0 1 * *;JOB_CLIENTMONTHLY_TRIGGER=0 45 20 * * *;JOB_COLLATERAL_TRIGGER=0 0 0/1 * * ?;JOB_DAILYCALCULATION_TRIGGER=0 0 15 * * *;JOB_DWMONTHLY_TRIGGER=0 30 18 * * *;JOB_LENDABLEDAILY_TRIGGER=0 0 18 * * *;JOB_LONNETREPORT_TRIGGER=0 0 19 * * *;JOB_PARTNERDAILY_TRIGGER=0 0 20 * * *;JOB_PARTNERMONTHLY_TRIGGER=0 15 19 * * *;JOB_POSITION_TRIGGER=0 0 14 * * *;JOB_SUPPLEMENTARYFTP_TRIGGER=0 30 21 * * *;JOB_SUPPLEMENTARYS3_TRIGGER=0 0 17 * * *;JOB_UPDATEFAILEDPOSITION_TRIGGER=0 0 0 * * *;JOB_UPLOADTOACCT_TRIGGER=0 0 16 * * *;LOANET_FOLDER_PREFIX=/LOANET/;POSITION_FOLDER_PREFIX=/;REPORTING_SERVICE_HOST=localhost;REPORTING_SERVICE_PORT=3010;SECLENDING_DATA_HOST=localhost;SECLENDING_DATA_PORT=3008;SECLENDING_SERVICE_GRAPHQL_PORT=3023;SECLENDING_SERVICE_HOST=localhost;SECLENDING_SERVICE_PORT=3010;STORAGE_MGNT_HOST=localhost;STORAGE_MGNT_PORT=3009 " +
                "Batch Service: " +
                "AWS_S3_ACCESSKEY=AKIARFPXVTINESPEHZXD;AWS_S3_BUCKET=dev-seclending-documents;AWS_S3_REGION=us-east-1;AWS_S3_SECRETKEY=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;CONFIG_DB_NAME=sec_lending;CONFIG_DB_PASSWORD=iPQPwy8H]LuKx3hz;CONFIG_DB_READ_HOST=10.175.32.152;CONFIG_DB_READ_PORT=5432;CONFIG_DB_USER=postgres;CONFIG_DB_WRITE_HOST=10.175.32.152;CONFIG_DB_WRITE_PORT=5432;CONFIG_SLACK_URI=https://hooks.slack.com/services/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;loanet_FOLDER_PREFIX=/LOANET/REPORTS/;POSITION_FOLDER_PREFIX=/;REPORTING_SERVICE_HOST=localhost;REPORTING_SERVICE_PORT=3010;SECLENDING_DATA_HOST=localhost;SECLENDING_DATA_PORT=3008;SECLENDING_SERVICE_GRAPHQL_PORT=3031;SECLENDING_SERVICE_HOST=localhost;SECLENDING_SERVICE_PORT=3010;STORAGE_MGNT_HOST=localhost;STORAGE_MGNT_PORT=3009 " +
                "Reporting Service: " +
                "AWS_S3_ACCESSKEY=AKIARFPXVTINP4BX25R3;AWS_S3_BUCKET=dw-pt-documents;AWS_S3_REGION=us-east-1;AWS_S3_SECRETKEY=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;BATCH_SERVICE_HOST=10.175.1.55;BATCH_SERVICE_PORT=3032;BROKER_FOLDER_PREFIX=/245_DRIVEWEALTH_LLC/;COLLATERAL_FOLDER_PREFIX=/245_DRIVEWEALTH_LLC/;CONFIG_DB_NAME=sec_lending;CONFIG_DB_PASSWORD=iPQPwy8H]LuKx3hz;CONFIG_DB_READ_HOST=10.175.32.152;CONFIG_DB_READ_PORT=5432;CONFIG_DB_USER=postgres;CONFIG_DB_WRITE_HOST=10.175.32.152;CONFIG_DB_WRITE_PORT=5432;CONFIG_SLACK_URI=https://hooks.slack.com/services/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;G_SERVICE_ACCOUNT_EMAIL=;G_SERVICE_ACCOUNT_KEY=;G_SERVICE_APPLICATION_NAME=;G_SERVICE_ROOT_DIR=;GOOGLEDRIVE_FOLDER_PREFIX=;JASPER_REPORT_KEY=dev;JASPER_REPORT_PASSWORD=QimMKHv4uEni;JASPER_REPORT_URL=http://10.175.1.140/jasperserver;JASPER_REPORT_USERNAME=jasperadmin;JOB_AXOS_TRIGGER=0 0 13 * * *;JOB_CLIENTDAILY_TRIGGER=0 0 17 * * *;JOB_CLIENTEOM_TRIGGER=0 0 0 1 * *;JOB_CLIENTMONTHLY_TRIGGER=0 0 17 * * *;JOB_COLLATERAL_TRIGGER=0 0 0/1 * * ?;JOB_DAILYCALCULATION_TRIGGER=0 0 15 * * *;JOB_DWMONTHLY_TRIGGER=0 0 17 * * *;JOB_LENDABLEDAILY_TRIGGER=0 0 17 * * *;JOB_LONNETREPORT_TRIGGER=0 0 17 * * *;JOB_PARTNERDAILY_TRIGGER=0 0 17 * * *;JOB_PARTNERMONTHLY_TRIGGER=0 0 17 * * *;JOB_POSITION_TRIGGER=0 0 14 * * *;JOB_SUPPLEMENTARYFTP_TRIGGER=0 0 17 * * *;JOB_SUPPLEMENTARYS3_TRIGGER=0 0 17 * * *;JOB_UPDATEFAILEDPOSITION_TRIGGER=0 0 17 * * *;JOB_UPLOADTOACCT_TRIGGER=0 0 16 * * *;POSITION_FOLDER_PREFIX=/;REPORTING_SERVICE_HOST=localhost;REPORTING_SERVICE_PORT=3010;SECLENDING_DATA_HOST=localhost;SECLENDING_DATA_PORT=3008;SECLENDING_SERVICE_GRAPHQL_PORT=3023;SECLENDING_SERVICE_HOST=localhost;SECLENDING_SERVICE_PORT=3010;STORAGE_MGNT_HOST=localhost;STORAGE_MGNT_PORT=3009;SUPPLEMENTAL_FOLDER_PREFIX=/DEV " +
                "storage env " +
                "AWS_S3_ACCESSKEY=AKIARFPXVTINESPEHZXD;AWS_S3_BUCKET=dev-seclending-documents;AWS_S3_REGION=us-east-1;AWS_S3_SECRETKEY=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;CONFIG_DB_NAME=sec_lending;CONFIG_DB_PASSWORD=iPQPwy8H]LuKx3hz;CONFIG_DB_READ_HOST=10.175.32.152;CONFIG_DB_READ_PORT=5432;CONFIG_DB_USER=postgres;CONFIG_DB_WRITE_HOST=10.175.32.152;CONFIG_DB_WRITE_PORT=5432"
        );
        bufferedWriter.newLine();
        bufferedWriter.write("When I was a little boy in elementary school, the neighborhood kids and I all looked forward to playing so many games in my backyard during the long summer holidays between grades. For instance, one of our favorite games was whiffle ball, a kid's version of baseball. All we needed was a cheap plastic bat and a cheap plastic ball and we could entertain ourselves in the backyard from morning to afternoon. Or if we broke the bat or lost the ball, we would play \"Red Rover, Red Rover.\" To play this game, we would join hands in two opposing lines and hurl ourselves at the locked wrists of the opposing team, trying to break through their line. Once the sun set, our favorite game was hide-and-seek. My backyard was perfect because there were lots of bushes and trees where we could hide out of sight of the kid who was \"it.\" Even on rainy days, we had fun activities out in the garden shed in the corner of the backyard. For instance, we would often act out our favorite TV game shows, like \"Let's Make a Deal,\" or sing along to the theme song from \"The Monkees,\" a popular TV show about a rock-and-roll band, on my little record player. Even now, fifty years later, I still look back on all those fun summertime games out in my backyard with a lot of fondness.");
        /*bufferedWriter.append(" ,I am from Chennai");
        bufferedWriter.newLine();
        bufferedWriter.write("Thank You !!");*/
        bufferedWriter.close();
    }
}